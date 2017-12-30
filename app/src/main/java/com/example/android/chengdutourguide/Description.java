package com.example.android.chengdutourguide;

/**
 * Created by zheng on 2017/12/1.
 */

public class Description {
    // String value

    private String mName;

    private String mDetail;

    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;


    /**
     * Constructs a new object with two Texts and one ImageViewId.
     */
    public Description(String nameText, String detailText, int imageId) {
        mName = nameText;
        mDetail = detailText;
        mImageResourceId = imageId;
    }

    /**
     * Get the string value of the destination or entertainment.
     * @return current text of mName
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the string value of the detail.
     *
     * @return current text of mDetail.
     */
    public String getDetail() {
        return mDetail;
    }

    /**
     * Gets the ID of the picture.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return whether there is a valid image.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }
}
