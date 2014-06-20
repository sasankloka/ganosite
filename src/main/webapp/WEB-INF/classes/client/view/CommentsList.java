/**
 * 
 */
package com.ppp.prm.portal.client.view;

import java.util.List;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.ppp.prm.portal.client.exceptions.ClientException;
import com.ppp.prm.portal.client.service.ClientCommentsService;
import com.ppp.prm.portal.client.service.ClientCommentsServiceAsync;
import com.ppp.prm.portal.shared.dto.Comments;

/**
 * Comments List view
 * 
 */
public class CommentsList extends ParentView {

	private static CommentsListUiBinder uiBinder = GWT
			.create(CommentsListUiBinder.class);

	/**
	 * CommentsServiceAsync
	 */
	private ClientCommentsServiceAsync CommentsServiceAsync = (ClientCommentsServiceAsync) GWT
			.create(ClientCommentsService.class);
	

	interface CommentsListUiBinder extends UiBinder<Widget, CommentsList> {
	}

	/**
	 * The main CellTable.
	 */
	@UiField(provided = true)
	// CellTable<CommentsDTO> cellTable; DetachHibernateUtil
	CellTable<Comments> cellTable;

	/**
	 * The pager used to change the range of data.
	 */
	@UiField(provided = true)
	SimplePager pager;
	/**
	 * The button add Comments
	 */
//	@UiField
//	Button AddCommentButton;

	/**
	 * Initialize this list of Comments
	 */
	public CommentsList() {
		// Create a CellTable.
		// cellTable = new CellTable<CommentsDTO>(); DetachHibernateUtil
		cellTable = new CellTable<Comments>();

		cellTable.setWidth("100%", true);

		// Create a Pager to control the table.
		//SimplePager.Resources pagerResources = GWT
		//		.create(SimplePager.Resources.class);
		pager = new SimplePager();
		//pager.set(TextLocation.CENTER);
		pager.setPageSize(6);
		
		pager.setDisplay(cellTable);

		// Initialize the columns.
		initTableColumns();

		// Load data from the server
		loadData();
		initWidget(uiBinder.createAndBindUi(this));

	}

	private void loadData() {
		// Create a data provider.
	//	ListDataProvider<CommentsDTO> dataProvider = new ListDataProvider<CommentsDTO>(); DetachHibernate
		ListDataProvider<Comments> dataProvider = new ListDataProvider<Comments>();

		// Connect the table to the data provider.
		dataProvider.addDataDisplay(cellTable);

		// Add the data to the data provider, which automatically pushes it to
		// the
		// widget.
		// final List<CommentsDTO> list = dataProvider.getList(); DetachHierbate

		final List<Comments> list = dataProvider.getList();
		
		// Access to Base donnees
		try {
			CommentsServiceAsync
					// .getComments(new AsyncCallback<List<CommentsDTO>>() { DetachHierbate
			.getComments(new AsyncCallback<List<Comments>>() {
						public void onFailure(Throwable caught) {
					    	Window.alert("RPC failed.");
						      Log.error("RPC failed." + caught.getMessage());
						}

						@Override
						// public void onSuccess(List<CommentsDTO> result) {
						public void onSuccess(List<Comments> result) {	
						
						// TODO Auto-generated method stub
							list.addAll(result);

						}

					});

		} catch (ClientException e) {
			Window.alert("Server ERROR" + e.getMessage());
		} catch (Exception e) {
			Window.alert("Client ERROR" + e.getMessage());
		}

		// Attach a column sort handler to the ListDataProvider to sort the
		// list.
		// ListHandler<CommentsDTO> sortHandler = new ListHandler<CommentsDTO>(list); DeatachHibernate
		ListHandler<Comments> sortHandler = new ListHandler<Comments>(list);
		cellTable.addColumnSortHandler(sortHandler);

	}

	/**
	 * Add the columns to the table.
	 */
	private void initTableColumns() {

		// Create name column.
	//	TextColumn<CommentsDTO> userCodeColumn = new TextColumn<CommentsDTO>() { DeatchHibernate
		TextColumn<Comments> userCodeColumn = new TextColumn<Comments>() {
			@Override
			public String getValue(Comments object) { // Detachhibernate DTO
				return "test"; //object.getCodeUser();
			}
		};

		// Make the name column sortable.
		userCodeColumn.setSortable(true);

		// Create Comments column.
		TextColumn<Comments> CommentsColumn = new TextColumn<Comments>() { //DeatchHibernate
			@Override
			public String getValue(Comments object) { //DeatchHibernate
				return object.getDescr(); // getComments();
			}
		};

		CommentsColumn.setSortable(true);

		// Add the columns.
		cellTable.addColumn(userCodeColumn, messages.userCode());
		cellTable.setColumnWidth(userCodeColumn, 20, Unit.PCT);

		cellTable.addColumn(CommentsColumn, messages.Comment());
		cellTable.setColumnWidth(CommentsColumn, 20, Unit.PCT);

	}

	/*@UiHandler("AddCommentButton")
	void onClick(ClickEvent e) {
		// Change the page : go to Comments create
		RootPanel.get().clear();
		RootPanel.get().add(ViewFactory.createView(TypePage.COMMENTS_CREATE));

	}*/
}
