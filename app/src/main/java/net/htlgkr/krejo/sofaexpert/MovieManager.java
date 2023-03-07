package net.htlgkr.krejo.sofaexpert;

import java.util.List;

public class MovieManager {
    private int page;
    private int total_results;
    private int total_pages;
    private List<Movie> results;


    public MovieManager(int page, int total_results, int total_pages, List<Movie> results) {
        this.page = page;
        this.total_results = total_results;
        this.total_pages = total_pages;
        this.results = results;
    }

    public MovieManager() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder("MovieManager{" +
                "page=" + page +
                ", total_results=" + total_results +
                ", total_pages=" + total_pages +
                ", results: \n");
        for (Movie m :
                results) {
            resultString.append(m.toString());
        }
        return resultString.toString();
    }
}
