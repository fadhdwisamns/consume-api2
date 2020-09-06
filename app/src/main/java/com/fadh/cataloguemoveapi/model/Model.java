
package com.fadh.cataloguemoveapi.model;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model implements Serializable, Parcelable
{

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Rated")
    @Expose
    private String rated;
    @SerializedName("Released")
    @Expose
    private String released;
    @SerializedName("Runtime")
    @Expose
    private String runtime;
    @SerializedName("Genre")
    @Expose
    private String genre;
    @SerializedName("Director")
    @Expose
    private String director;
    @SerializedName("Writer")
    @Expose
    private String writer;
    @SerializedName("Actors")
    @Expose
    private String actors;
    @SerializedName("Plot")
    @Expose
    private String plot;
    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("Awards")
    @Expose
    private String awards;
    @SerializedName("Poster")
    @Expose
    private String poster;
    @SerializedName("Ratings")
    @Expose
    private List<Rating> ratings = null;
    @SerializedName("Metascore")
    @Expose
    private String metascore;
    @SerializedName("imdbRating")
    @Expose
    private String imdbRating;
    @SerializedName("imdbVotes")
    @Expose
    private String imdbVotes;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("DVD")
    @Expose
    private String dVD;
    @SerializedName("BoxOffice")
    @Expose
    private String boxOffice;
    @SerializedName("Production")
    @Expose
    private String production;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Response")
    @Expose
    private String response;
    public final static Parcelable.Creator<Model> CREATOR = new Creator<Model>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        public Model[] newArray(int size) {
            return (new Model[size]);
        }

    }
    ;
    private final static long serialVersionUID = -4888691884429194933L;

    protected Model(Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.year = ((String) in.readValue((String.class.getClassLoader())));
        this.rated = ((String) in.readValue((String.class.getClassLoader())));
        this.released = ((String) in.readValue((String.class.getClassLoader())));
        this.runtime = ((String) in.readValue((String.class.getClassLoader())));
        this.genre = ((String) in.readValue((String.class.getClassLoader())));
        this.director = ((String) in.readValue((String.class.getClassLoader())));
        this.writer = ((String) in.readValue((String.class.getClassLoader())));
        this.actors = ((String) in.readValue((String.class.getClassLoader())));
        this.plot = ((String) in.readValue((String.class.getClassLoader())));
        this.language = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.awards = ((String) in.readValue((String.class.getClassLoader())));
        this.poster = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.ratings, (com.fadh.cataloguemoveapi.model.Rating.class.getClassLoader()));
        this.metascore = ((String) in.readValue((String.class.getClassLoader())));
        this.imdbRating = ((String) in.readValue((String.class.getClassLoader())));
        this.imdbVotes = ((String) in.readValue((String.class.getClassLoader())));
        this.imdbID = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.dVD = ((String) in.readValue((String.class.getClassLoader())));
        this.boxOffice = ((String) in.readValue((String.class.getClassLoader())));
        this.production = ((String) in.readValue((String.class.getClassLoader())));
        this.website = ((String) in.readValue((String.class.getClassLoader())));
        this.response = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Model() {
    }

    /**
     * 
     * @param country
     * @param year
     * @param production
     * @param language
     * @param imdbRating
     * @param title
     * @param imdbVotes
     * @param type
     * @param dVD
     * @param plot
     * @param ratings
     * @param genre
     * @param released
     * @param website
     * @param director
     * @param imdbID
     * @param runtime
     * @param rated
     * @param actors
     * @param awards
     * @param response
     * @param writer
     * @param metascore
     * @param boxOffice
     * @param poster
     */
    public Model(String title, String year, String rated, String released, String runtime, String genre, String director, String writer, String actors, String plot, String language, String country, String awards, String poster, List<Rating> ratings, String metascore, String imdbRating, String imdbVotes, String imdbID, String type, String dVD, String boxOffice, String production, String website, String response) {
        super();
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.ratings = ratings;
        this.metascore = metascore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.type = type;
        this.dVD = dVD;
        this.boxOffice = boxOffice;
        this.production = production;
        this.website = website;
        this.response = response;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Model withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Model withYear(String year) {
        this.year = year;
        return this;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public Model withRated(String rated) {
        this.rated = rated;
        return this;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public Model withReleased(String released) {
        this.released = released;
        return this;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public Model withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Model withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Model withDirector(String director) {
        this.director = director;
        return this;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Model withWriter(String writer) {
        this.writer = writer;
        return this;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public Model withActors(String actors) {
        this.actors = actors;
        return this;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Model withPlot(String plot) {
        this.plot = plot;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Model withLanguage(String language) {
        this.language = language;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Model withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public Model withAwards(String awards) {
        this.awards = awards;
        return this;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Model withPoster(String poster) {
        this.poster = poster;
        return this;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public Model withRatings(List<Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public Model withMetascore(String metascore) {
        this.metascore = metascore;
        return this;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Model withImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
        return this;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public Model withImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
        return this;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public Model withImdbID(String imdbID) {
        this.imdbID = imdbID;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Model withType(String type) {
        this.type = type;
        return this;
    }

    public String getDVD() {
        return dVD;
    }

    public void setDVD(String dVD) {
        this.dVD = dVD;
    }

    public Model withDVD(String dVD) {
        this.dVD = dVD;
        return this;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public Model withBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
        return this;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Model withProduction(String production) {
        this.production = production;
        return this;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Model withWebsite(String website) {
        this.website = website;
        return this;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Model withResponse(String response) {
        this.response = response;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(year);
        dest.writeValue(rated);
        dest.writeValue(released);
        dest.writeValue(runtime);
        dest.writeValue(genre);
        dest.writeValue(director);
        dest.writeValue(writer);
        dest.writeValue(actors);
        dest.writeValue(plot);
        dest.writeValue(language);
        dest.writeValue(country);
        dest.writeValue(awards);
        dest.writeValue(poster);
        dest.writeList(ratings);
        dest.writeValue(metascore);
        dest.writeValue(imdbRating);
        dest.writeValue(imdbVotes);
        dest.writeValue(imdbID);
        dest.writeValue(type);
        dest.writeValue(dVD);
        dest.writeValue(boxOffice);
        dest.writeValue(production);
        dest.writeValue(website);
        dest.writeValue(response);
    }

    public int describeContents() {
        return  0;
    }

}
