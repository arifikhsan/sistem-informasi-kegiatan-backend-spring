package sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.view;

import sh.now.arifikhsanudin.sisteminformasikegiatanbackendspring.model.TodoModel;

import java.util.ArrayList;

public class GetTodosResponse {
    private ArrayList<TodoModel> data;

    public GetTodosResponse(ArrayList<TodoModel> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetTodosResponse{" +
                "data=" + data +
                '}';
    }

    public ArrayList<TodoModel> getData() {
        return data;
    }

    public void setData(ArrayList<TodoModel> data) {
        this.data = data;
    }
}
