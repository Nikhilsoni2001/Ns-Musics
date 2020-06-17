package com.nikhil.NsMusics;

class SongsDetails {

    private String mArtistName;
    private String mMusicName;
    private int mImageId;

    public SongsDetails(String artistName, String musicName, int imageId) {
        mArtistName = artistName;
        mMusicName = musicName;
        mImageId = imageId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getMusicName() {
        return mMusicName;
    }

    public int getImageId() {
        return mImageId;
    }

}
