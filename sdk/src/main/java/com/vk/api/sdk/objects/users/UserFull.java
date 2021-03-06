package com.vk.api.sdk.objects.users;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.audio.AudioFull;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Country;
import java.net.URL;
import java.util.List;
import java.util.Objects;

/**
 * UserFull object
 */
public class UserFull extends User {
    /**
     * User nickname
     */
    @SerializedName("nickname")
    private String nickname;

    /**
     * User maiden name
     */
    @SerializedName("maiden_name")
    private String maidenName;

    /**
     * Domain name of the user's page
     */
    @SerializedName("domain")
    private String domain;

    /**
     * User's date of birth
     */
    @SerializedName("bdate")
    private String bdate;

    @SerializedName("city")
    private BaseObject city;

    @SerializedName("country")
    private Country country;

    /**
     * User's timezone
     */
    @SerializedName("timezone")
    private Integer timezone;

    /**
     * URL of square photo of the user with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URL photo200;

    /**
     * URL of square photo of the user with maximum width
     */
    @SerializedName("photo_max")
    private URL photoMax;

    /**
     * URL of user's photo with 200 pixels in width
     */
    @SerializedName("photo_200_orig")
    private URL photo200Orig;

    /**
     * URL of user's photo with 400 pixels in width
     */
    @SerializedName("photo_400_orig")
    private URL photo400Orig;

    /**
     * URL of user's photo of maximum size
     */
    @SerializedName("photo_max_orig")
    private URL photoMaxOrig;

    /**
     * ID of the user's main photo
     */
    @SerializedName("photo_id")
    private String photoId;

    /**
     * Information whether the user has main photo
     */
    @SerializedName("has_photo")
    private BoolInt hasPhoto;

    /**
     * Information whether the community has a "fire" pictogram.
     */
    @SerializedName("trending")
    private BoolInt trending;

    /**
     * Information whether the user specified his phone number
     */
    @SerializedName("has_mobile")
    private BoolInt hasMobile;

    /**
     * Information whether the user is a friend of current user
     */
    @SerializedName("is_friend")
    private BoolInt isFriend;

    /**
     * Friend status for current user
     */
    @SerializedName("friend_status")
    private Integer friendStatus;

    /**
     * Information whether current user can comment wall posts
     */
    @SerializedName("wall_comments")
    private BoolInt wallComments;

    /**
     * Information whether current user can post on the user's wall
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    /**
     * Information whether current user can see other users' audio on the wall
     */
    @SerializedName("can_see_all_posts")
    private BoolInt canSeeAllPosts;

    /**
     * Information whether current user can see the user's audio
     */
    @SerializedName("can_see_audio")
    private BoolInt canSeeAudio;

    /**
     * Information whether current user can write private message
     */
    @SerializedName("can_write_private_message")
    private BoolInt canWritePrivateMessage;

    /**
     * Information whether current user can send a friend request
     */
    @SerializedName("can_send_friend_request")
    private BoolInt canSendFriendRequest;

    /**
     * Information whether current user can see
     */
    @SerializedName("mobile_phone")
    private String mobilePhone;

    /**
     * User's mobile phone number
     */
    @SerializedName("home_phone")
    private String homePhone;

    /**
     * User's Skype nickname
     */
    @SerializedName("skype")
    private String skype;

    /**
     * User's Facebook account
     */
    @SerializedName("facebook")
    private String facebook;

    /**
     * User's Facebook name
     */
    @SerializedName("facebook_name")
    private String facebookName;

    /**
     * User's Twitter account
     */
    @SerializedName("twitter")
    private String twitter;

    /**
     * User's Livejournal account
     */
    @SerializedName("livejournal")
    private String livejournal;

    /**
     * User's Instagram account
     */
    @SerializedName("instagram")
    private String instagram;

    /**
     * User's website
     */
    @SerializedName("site")
    private String site;

    @SerializedName("status_audio")
    private AudioFull statusAudio;

    /**
     * User's status
     */
    @SerializedName("status")
    private String status;

    /**
     * User's status
     */
    @SerializedName("activity")
    private String activity;

    @SerializedName("last_seen")
    private LastSeen lastSeen;

    @SerializedName("exports")
    private Exports exports;

    @SerializedName("crop_photo")
    private CropPhoto cropPhoto;

    /**
     * Information whether the user is verified
     */
    @SerializedName("verified")
    private BoolInt verified;

    /**
     * Number of user's followers
     */
    @SerializedName("followers_count")
    private Integer followersCount;

    /**
     * Information whether current user is in the requested user's blacklist.
     */
    @SerializedName("blacklisted")
    private BoolInt blacklisted;

    /**
     * Information whether the requested user is in current user's blacklist
     */
    @SerializedName("blacklisted_by_me")
    private BoolInt blacklistedByMe;

    /**
     * Information whether the requested user is in faves of current user
     */
    @SerializedName("is_favorite")
    private BoolInt isFavorite;

    /**
     * Information whether the requested user is hidden from current user's newsfeed
     */
    @SerializedName("is_hidden_from_feed")
    private BoolInt isHiddenFromFeed;

    /**
     * Number of common friends with current user
     */
    @SerializedName("common_count")
    private Integer commonCount;

    @SerializedName("occupation")
    private Occupation occupation;

    @SerializedName("career")
    private List<Career> career;

    @SerializedName("military")
    private List<Military> military;

    /**
     * University ID
     */
    @SerializedName("university")
    private Integer university;

    /**
     * University name
     */
    @SerializedName("university_name")
    private String universityName;

    /**
     * Faculty ID
     */
    @SerializedName("faculty")
    private Integer faculty;

    /**
     * Faculty name
     */
    @SerializedName("faculty_name")
    private String facultyName;

    /**
     * Graduation year
     */
    @SerializedName("graduation")
    private Integer graduation;

    /**
     * Education form
     */
    @SerializedName("education_form")
    private String educationForm;

    /**
     * User's education status
     */
    @SerializedName("education_status")
    private String educationStatus;

    /**
     * User hometown
     */
    @SerializedName("home_town")
    private String homeTown;

    /**
     * User relationship status
     */
    @SerializedName("relation")
    private Integer relation;

    @SerializedName("relation_partner")
    private UserMin relationPartner;

    @SerializedName("personal")
    private Personal personal;

    /**
     * User's interests
     */
    @SerializedName("interests")
    private String interests;

    /**
     * User's favorite music
     */
    @SerializedName("music")
    private String music;

    /**
     * User's activities
     */
    @SerializedName("activities")
    private String activities;

    /**
     * User's favorite movies
     */
    @SerializedName("movies")
    private String movies;

    /**
     * User's favorite tv shows
     */
    @SerializedName("tv")
    private String tv;

    /**
     * User's favorite books
     */
    @SerializedName("books")
    private String books;

    /**
     * User's favorite games
     */
    @SerializedName("games")
    private String games;

    @SerializedName("universities")
    private List<University> universities;

    @SerializedName("schools")
    private List<School> schools;

    /**
     * About me field
     */
    @SerializedName("about")
    private String about;

    @SerializedName("relatives")
    private List<Relative> relatives;

    /**
     * Favorite quotes
     */
    @SerializedName("quotes")
    private String quotes;

    /**
     * Information whether current user is subscribed to podcasts
     */
    @SerializedName("is_subscribed_podcasts")
    private Boolean isSubscribedPodcasts;

    /**
     * Owner in whitelist or not
     */
    @SerializedName("can_subscribe_podcasts")
    private Boolean canSubscribePodcasts;

    /**
     * Can subscribe to wall
     */
    @SerializedName("can_subscribe_posts")
    private Boolean canSubscribePosts;

    public String getNickname() {
        return nickname;
    }

    public UserFull setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public UserFull setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
    }

    public String getDomain() {
        return domain;
    }

    public UserFull setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getBdate() {
        return bdate;
    }

    public UserFull setBdate(String bdate) {
        this.bdate = bdate;
        return this;
    }

    public BaseObject getCity() {
        return city;
    }

    public UserFull setCity(BaseObject city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public UserFull setCountry(Country country) {
        this.country = country;
        return this;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public UserFull setTimezone(Integer timezone) {
        this.timezone = timezone;
        return this;
    }

    public URL getPhoto200() {
        return photo200;
    }

    public UserFull setPhoto200(URL photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URL getPhotoMax() {
        return photoMax;
    }

    public UserFull setPhotoMax(URL photoMax) {
        this.photoMax = photoMax;
        return this;
    }

    public URL getPhoto200Orig() {
        return photo200Orig;
    }

    public UserFull setPhoto200Orig(URL photo200Orig) {
        this.photo200Orig = photo200Orig;
        return this;
    }

    public URL getPhoto400Orig() {
        return photo400Orig;
    }

    public UserFull setPhoto400Orig(URL photo400Orig) {
        this.photo400Orig = photo400Orig;
        return this;
    }

    public URL getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public UserFull setPhotoMaxOrig(URL photoMaxOrig) {
        this.photoMaxOrig = photoMaxOrig;
        return this;
    }

    public String getPhotoId() {
        return photoId;
    }

    public UserFull setPhotoId(String photoId) {
        this.photoId = photoId;
        return this;
    }

    public boolean isHasPhoto() {
        return hasPhoto == BoolInt.YES;
    }

    public BoolInt getHasPhoto() {
        return hasPhoto;
    }

    public boolean isTrending() {
        return trending == BoolInt.YES;
    }

    public BoolInt getTrending() {
        return trending;
    }

    public boolean isHasMobile() {
        return hasMobile == BoolInt.YES;
    }

    public BoolInt getHasMobile() {
        return hasMobile;
    }

    public boolean isFriend() {
        return isFriend == BoolInt.YES;
    }

    public BoolInt getIsFriend() {
        return isFriend;
    }

    public Integer getFriendStatus() {
        return friendStatus;
    }

    public UserFull setFriendStatus(Integer friendStatus) {
        this.friendStatus = friendStatus;
        return this;
    }

    public boolean isWallComments() {
        return wallComments == BoolInt.YES;
    }

    public BoolInt getWallComments() {
        return wallComments;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts == BoolInt.YES;
    }

    public BoolInt getCanSeeAllPosts() {
        return canSeeAllPosts;
    }

    public boolean canSeeAudio() {
        return canSeeAudio == BoolInt.YES;
    }

    public BoolInt getCanSeeAudio() {
        return canSeeAudio;
    }

    public boolean canWritePrivateMessage() {
        return canWritePrivateMessage == BoolInt.YES;
    }

    public BoolInt getCanWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public boolean canSendFriendRequest() {
        return canSendFriendRequest == BoolInt.YES;
    }

    public BoolInt getCanSendFriendRequest() {
        return canSendFriendRequest;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public UserFull setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public UserFull setHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public String getSkype() {
        return skype;
    }

    public UserFull setSkype(String skype) {
        this.skype = skype;
        return this;
    }

    public String getFacebook() {
        return facebook;
    }

    public UserFull setFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public UserFull setFacebookName(String facebookName) {
        this.facebookName = facebookName;
        return this;
    }

    public String getTwitter() {
        return twitter;
    }

    public UserFull setTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    public String getLivejournal() {
        return livejournal;
    }

    public UserFull setLivejournal(String livejournal) {
        this.livejournal = livejournal;
        return this;
    }

    public String getInstagram() {
        return instagram;
    }

    public UserFull setInstagram(String instagram) {
        this.instagram = instagram;
        return this;
    }

    public String getSite() {
        return site;
    }

    public UserFull setSite(String site) {
        this.site = site;
        return this;
    }

    public AudioFull getStatusAudio() {
        return statusAudio;
    }

    public UserFull setStatusAudio(AudioFull statusAudio) {
        this.statusAudio = statusAudio;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserFull setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getActivity() {
        return activity;
    }

    public UserFull setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public LastSeen getLastSeen() {
        return lastSeen;
    }

    public UserFull setLastSeen(LastSeen lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public Exports getExports() {
        return exports;
    }

    public UserFull setExports(Exports exports) {
        this.exports = exports;
        return this;
    }

    public CropPhoto getCropPhoto() {
        return cropPhoto;
    }

    public UserFull setCropPhoto(CropPhoto cropPhoto) {
        this.cropPhoto = cropPhoto;
        return this;
    }

    public boolean isVerified() {
        return verified == BoolInt.YES;
    }

    public BoolInt getVerified() {
        return verified;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public UserFull setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
        return this;
    }

    public boolean isBlacklisted() {
        return blacklisted == BoolInt.YES;
    }

    public BoolInt getBlacklisted() {
        return blacklisted;
    }

    public boolean isBlacklistedByMe() {
        return blacklistedByMe == BoolInt.YES;
    }

    public BoolInt getBlacklistedByMe() {
        return blacklistedByMe;
    }

    public boolean isFavorite() {
        return isFavorite == BoolInt.YES;
    }

    public BoolInt getIsFavorite() {
        return isFavorite;
    }

    public boolean isHiddenFromFeed() {
        return isHiddenFromFeed == BoolInt.YES;
    }

    public BoolInt getIsHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    public UserFull setCommonCount(Integer commonCount) {
        this.commonCount = commonCount;
        return this;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public UserFull setOccupation(Occupation occupation) {
        this.occupation = occupation;
        return this;
    }

    public List<Career> getCareer() {
        return career;
    }

    public UserFull setCareer(List<Career> career) {
        this.career = career;
        return this;
    }

    public List<Military> getMilitary() {
        return military;
    }

    public UserFull setMilitary(List<Military> military) {
        this.military = military;
        return this;
    }

    public Integer getUniversity() {
        return university;
    }

    public UserFull setUniversity(Integer university) {
        this.university = university;
        return this;
    }

    public String getUniversityName() {
        return universityName;
    }

    public UserFull setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public UserFull setFaculty(Integer faculty) {
        this.faculty = faculty;
        return this;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public UserFull setFacultyName(String facultyName) {
        this.facultyName = facultyName;
        return this;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public UserFull setGraduation(Integer graduation) {
        this.graduation = graduation;
        return this;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public UserFull setEducationForm(String educationForm) {
        this.educationForm = educationForm;
        return this;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public UserFull setEducationStatus(String educationStatus) {
        this.educationStatus = educationStatus;
        return this;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public UserFull setHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public Integer getRelation() {
        return relation;
    }

    public UserFull setRelation(Integer relation) {
        this.relation = relation;
        return this;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public UserFull setRelationPartner(UserMin relationPartner) {
        this.relationPartner = relationPartner;
        return this;
    }

    public Personal getPersonal() {
        return personal;
    }

    public UserFull setPersonal(Personal personal) {
        this.personal = personal;
        return this;
    }

    public String getInterests() {
        return interests;
    }

    public UserFull setInterests(String interests) {
        this.interests = interests;
        return this;
    }

    public String getMusic() {
        return music;
    }

    public UserFull setMusic(String music) {
        this.music = music;
        return this;
    }

    public String getActivities() {
        return activities;
    }

    public UserFull setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    public String getMovies() {
        return movies;
    }

    public UserFull setMovies(String movies) {
        this.movies = movies;
        return this;
    }

    public String getTv() {
        return tv;
    }

    public UserFull setTv(String tv) {
        this.tv = tv;
        return this;
    }

    public String getBooks() {
        return books;
    }

    public UserFull setBooks(String books) {
        this.books = books;
        return this;
    }

    public String getGames() {
        return games;
    }

    public UserFull setGames(String games) {
        this.games = games;
        return this;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public UserFull setUniversities(List<University> universities) {
        this.universities = universities;
        return this;
    }

    public List<School> getSchools() {
        return schools;
    }

    public UserFull setSchools(List<School> schools) {
        this.schools = schools;
        return this;
    }

    public String getAbout() {
        return about;
    }

    public UserFull setAbout(String about) {
        this.about = about;
        return this;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public UserFull setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
        return this;
    }

    public String getQuotes() {
        return quotes;
    }

    public UserFull setQuotes(String quotes) {
        this.quotes = quotes;
        return this;
    }

    public Boolean getIsSubscribedPodcasts() {
        return isSubscribedPodcasts;
    }

    public UserFull setIsSubscribedPodcasts(Boolean isSubscribedPodcasts) {
        this.isSubscribedPodcasts = isSubscribedPodcasts;
        return this;
    }

    public Boolean getCanSubscribePodcasts() {
        return canSubscribePodcasts;
    }

    public UserFull setCanSubscribePodcasts(Boolean canSubscribePodcasts) {
        this.canSubscribePodcasts = canSubscribePodcasts;
        return this;
    }

    public Boolean getCanSubscribePosts() {
        return canSubscribePosts;
    }

    public UserFull setCanSubscribePosts(Boolean canSubscribePosts) {
        this.canSubscribePosts = canSubscribePosts;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trending, canSendFriendRequest, universityName, country, canSubscribePosts, career, tv, bdate, occupation, about, instagram, educationForm, faculty, relation, quotes, movies, friendStatus, twitter, music, universities, canSeeAudio, homeTown, graduation, photoMaxOrig, games, military, canSeeAllPosts, homePhone, livejournal, personal, relatives, educationStatus, lastSeen, canSubscribePodcasts, books, hasPhoto, mobilePhone, schools, domain, photo400Orig, facultyName, followersCount, isHiddenFromFeed, facebookName, statusAudio, status, isFavorite, relationPartner, activity, city, cropPhoto, timezone, exports, university, isSubscribedPodcasts, maidenName, photo200, skype, canPost, wallComments, nickname, photoMax, isFriend, commonCount, hasMobile, facebook, verified, photo200Orig, photoId, blacklistedByMe, site, blacklisted, activities, canWritePrivateMessage, interests);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserFull userFull = (UserFull) o;
        return Objects.equals(trending, userFull.trending) &&
                Objects.equals(country, userFull.country) &&
                Objects.equals(friendStatus, userFull.friendStatus) &&
                Objects.equals(career, userFull.career) &&
                Objects.equals(tv, userFull.tv) &&
                Objects.equals(bdate, userFull.bdate) &&
                Objects.equals(canSendFriendRequest, userFull.canSendFriendRequest) &&
                Objects.equals(occupation, userFull.occupation) &&
                Objects.equals(lastSeen, userFull.lastSeen) &&
                Objects.equals(blacklistedByMe, userFull.blacklistedByMe) &&
                Objects.equals(about, userFull.about) &&
                Objects.equals(instagram, userFull.instagram) &&
                Objects.equals(statusAudio, userFull.statusAudio) &&
                Objects.equals(educationForm, userFull.educationForm) &&
                Objects.equals(faculty, userFull.faculty) &&
                Objects.equals(relation, userFull.relation) &&
                Objects.equals(quotes, userFull.quotes) &&
                Objects.equals(movies, userFull.movies) &&
                Objects.equals(relationPartner, userFull.relationPartner) &&
                Objects.equals(twitter, userFull.twitter) &&
                Objects.equals(music, userFull.music) &&
                Objects.equals(universities, userFull.universities) &&
                Objects.equals(graduation, userFull.graduation) &&
                Objects.equals(canSubscribePodcasts, userFull.canSubscribePodcasts) &&
                Objects.equals(games, userFull.games) &&
                Objects.equals(military, userFull.military) &&
                Objects.equals(canSeeAllPosts, userFull.canSeeAllPosts) &&
                Objects.equals(homePhone, userFull.homePhone) &&
                Objects.equals(commonCount, userFull.commonCount) &&
                Objects.equals(livejournal, userFull.livejournal) &&
                Objects.equals(personal, userFull.personal) &&
                Objects.equals(relatives, userFull.relatives) &&
                Objects.equals(photoMax, userFull.photoMax) &&
                Objects.equals(canSeeAudio, userFull.canSeeAudio) &&
                Objects.equals(homeTown, userFull.homeTown) &&
                Objects.equals(books, userFull.books) &&
                Objects.equals(isSubscribedPodcasts, userFull.isSubscribedPodcasts) &&
                Objects.equals(schools, userFull.schools) &&
                Objects.equals(domain, userFull.domain) &&
                Objects.equals(photo200Orig, userFull.photo200Orig) &&
                Objects.equals(photo400Orig, userFull.photo400Orig) &&
                Objects.equals(status, userFull.status) &&
                Objects.equals(hasMobile, userFull.hasMobile) &&
                Objects.equals(isFavorite, userFull.isFavorite) &&
                Objects.equals(photoId, userFull.photoId) &&
                Objects.equals(activity, userFull.activity) &&
                Objects.equals(city, userFull.city) &&
                Objects.equals(timezone, userFull.timezone) &&
                Objects.equals(exports, userFull.exports) &&
                Objects.equals(university, userFull.university) &&
                Objects.equals(canSubscribePosts, userFull.canSubscribePosts) &&
                Objects.equals(hasPhoto, userFull.hasPhoto) &&
                Objects.equals(photoMaxOrig, userFull.photoMaxOrig) &&
                Objects.equals(skype, userFull.skype) &&
                Objects.equals(facultyName, userFull.facultyName) &&
                Objects.equals(mobilePhone, userFull.mobilePhone) &&
                Objects.equals(nickname, userFull.nickname) &&
                Objects.equals(isHiddenFromFeed, userFull.isHiddenFromFeed) &&
                Objects.equals(canPost, userFull.canPost) &&
                Objects.equals(photo200, userFull.photo200) &&
                Objects.equals(maidenName, userFull.maidenName) &&
                Objects.equals(wallComments, userFull.wallComments) &&
                Objects.equals(facebook, userFull.facebook) &&
                Objects.equals(verified, userFull.verified) &&
                Objects.equals(universityName, userFull.universityName) &&
                Objects.equals(educationStatus, userFull.educationStatus) &&
                Objects.equals(canWritePrivateMessage, userFull.canWritePrivateMessage) &&
                Objects.equals(site, userFull.site) &&
                Objects.equals(blacklisted, userFull.blacklisted) &&
                Objects.equals(activities, userFull.activities) &&
                Objects.equals(cropPhoto, userFull.cropPhoto) &&
                Objects.equals(followersCount, userFull.followersCount) &&
                Objects.equals(facebookName, userFull.facebookName) &&
                Objects.equals(interests, userFull.interests) &&
                Objects.equals(isFriend, userFull.isFriend);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("UserFull{");
        sb.append("trending=").append(trending);
        sb.append(", country=").append(country);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", career=").append(career);
        sb.append(", tv='").append(tv).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest);
        sb.append(", occupation=").append(occupation);
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", blacklistedByMe=").append(blacklistedByMe);
        sb.append(", about='").append(about).append("'");
        sb.append(", instagram='").append(instagram).append("'");
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append(", relation=").append(relation);
        sb.append(", quotes='").append(quotes).append("'");
        sb.append(", movies='").append(movies).append("'");
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", twitter='").append(twitter).append("'");
        sb.append(", music='").append(music).append("'");
        sb.append(", universities=").append(universities);
        sb.append(", graduation=").append(graduation);
        sb.append(", canSubscribePodcasts=").append(canSubscribePodcasts);
        sb.append(", games='").append(games).append("'");
        sb.append(", military=").append(military);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", homePhone='").append(homePhone).append("'");
        sb.append(", commonCount=").append(commonCount);
        sb.append(", livejournal='").append(livejournal).append("'");
        sb.append(", personal=").append(personal);
        sb.append(", relatives=").append(relatives);
        sb.append(", photoMax=").append(photoMax);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", books='").append(books).append("'");
        sb.append(", isSubscribedPodcasts=").append(isSubscribedPodcasts);
        sb.append(", schools=").append(schools);
        sb.append(", domain='").append(domain).append("'");
        sb.append(", photo200Orig=").append(photo200Orig);
        sb.append(", photo400Orig=").append(photo400Orig);
        sb.append(", status='").append(status).append("'");
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", photoId='").append(photoId).append("'");
        sb.append(", activity='").append(activity).append("'");
        sb.append(", city=").append(city);
        sb.append(", timezone=").append(timezone);
        sb.append(", exports=").append(exports);
        sb.append(", university=").append(university);
        sb.append(", canSubscribePosts=").append(canSubscribePosts);
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", photoMaxOrig=").append(photoMaxOrig);
        sb.append(", skype='").append(skype).append("'");
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", mobilePhone='").append(mobilePhone).append("'");
        sb.append(", nickname='").append(nickname).append("'");
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", canPost=").append(canPost);
        sb.append(", photo200=").append(photo200);
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", wallComments=").append(wallComments);
        sb.append(", facebook='").append(facebook).append("'");
        sb.append(", verified=").append(verified);
        sb.append(", universityName='").append(universityName).append("'");
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", site='").append(site).append("'");
        sb.append(", blacklisted=").append(blacklisted);
        sb.append(", activities='").append(activities).append("'");
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", followersCount=").append(followersCount);
        sb.append(", facebookName='").append(facebookName).append("'");
        sb.append(", interests='").append(interests).append("'");
        sb.append(", isFriend=").append(isFriend);
        sb.append('}');
        return sb.toString();
    }
}
