package com.example.android.miwok;

public class Word {
       private String mDefaultTranslation;
       private String mMiwokTranslation;
       private int mImageResourseId = NO_IMAGE_PROVIDED;
       private static final int NO_IMAGE_PROVIDED=-1;
       private int mAudioResourseId;
       public Word(String MiwokTranslation,String DefaultTranslation,int audioResourseId)
       {
           mDefaultTranslation = DefaultTranslation;
           mMiwokTranslation = MiwokTranslation;
           mAudioResourseId=audioResourseId;
       }
       public Word(String MiwokTranslation,String DefaultTranslation,int ImageResourceId,int audioResourseId){
           mDefaultTranslation = DefaultTranslation;
           mMiwokTranslation = MiwokTranslation;
           mImageResourseId =ImageResourceId;
           mAudioResourseId= audioResourseId;
       }
       public String getDefaultTranslation(){
           return mDefaultTranslation;
       }
       public int getmImageResourseId(){
           return mImageResourseId;
       }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmAudioResourseId(){
           return mAudioResourseId;
    }
    public boolean hasImage(){
                  return mImageResourseId != NO_IMAGE_PROVIDED;
    }


}
