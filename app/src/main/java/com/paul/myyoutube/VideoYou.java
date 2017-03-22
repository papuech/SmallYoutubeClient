package com.paul.myyoutube;

import java.util.List;

/**
 * Created by Paul on 17/03/2017.
 */

public class VideoYou {


    /**
     * kind : youtube#searchListResponse
     * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/Dr9zDiajcJ_Bs9iGCDRv28c1Lo0"
     * nextPageToken : CAUQAA
     * regionCode : FR
     * pageInfo : {"totalResults":1000000,"resultsPerPage":5}
     * items : [{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/fOatISocUPwQQB9jRbLVQNleHB0\"","id":{"kind":"youtube#video","videoId":"_Yhyp-_hX2s"},"snippet":{"publishedAt":"2015-08-07T01:12:12.000Z","channelId":"UCstaTFTqZAC_OqfAq_JF6vA","title":"Eminem - Lose Yourself [HD]","description":"feat. Eminem from the movie 8 MILE No copyright infringement intended. All contents belong to its rightful owners. This is for entertainment purposes only.","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/hqdefault.jpg","width":480,"height":360}},"channelTitle":"msvogue23","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/q8oBOyo3JoA36c2QYq90kgUrXQ4\"","id":{"kind":"youtube#video","videoId":"YVkUvmDQ3HY"},"snippet":{"publishedAt":"2009-06-16T23:00:29.000Z","channelId":"UC20vb-R_px4CguHzzBPhoyQ","title":"Eminem - Without Me","description":"iTunes: http://smarturl.it/WithoutMe Amazon: http://smarturl.it/WithoutMeAmz Google Play: http://smarturl.it/WithoutMeGP Music video by Eminem performing ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/YVkUvmDQ3HY/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/YVkUvmDQ3HY/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/YVkUvmDQ3HY/hqdefault.jpg","width":480,"height":360}},"channelTitle":"EminemVEVO","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/FTtKSwtGoHXxlCvWG5OF3Ntkrtg\"","id":{"kind":"youtube#video","videoId":"j5-yKhDd64s"},"snippet":{"publishedAt":"2010-06-05T05:02:39.000Z","channelId":"UC20vb-R_px4CguHzzBPhoyQ","title":"Eminem - Not Afraid","description":"Music video by Eminem performing Not Afraid. (C) 2010 Aftermath Records #VEVOCertified on September 11, 2010.http://www.vevo.com/certified ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/j5-yKhDd64s/hqdefault.jpg","width":480,"height":360}},"channelTitle":"EminemVEVO","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/462Wzguy8LdnW8cQzKS3P9yPKMo\"","id":{"kind":"youtube#video","videoId":"XbGs_qK2PQA"},"snippet":{"publishedAt":"2013-11-27T16:50:00.000Z","channelId":"UC20vb-R_px4CguHzzBPhoyQ","title":"Eminem - Rap God (Explicit)","description":"Download Eminem's 'MMLP2' Album on iTunes now:http://smarturl.it/MMLP2 Credits below Video Director: Rich Lee Video Producer: Justin Diener Video ...","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/XbGs_qK2PQA/hqdefault.jpg","width":480,"height":360}},"channelTitle":"EminemVEVO","liveBroadcastContent":"none"}},{"kind":"youtube#searchResult","etag":"\"uQc-MPTsstrHkQcRXL3IWLmeNsM/Q9WZUoIsnK4QfAidmOQUNllgtqY\"","id":{"kind":"youtube#video","videoId":"1wYNFfgrXTI"},"snippet":{"publishedAt":"2009-06-17T00:23:36.000Z","channelId":"UC20vb-R_px4CguHzzBPhoyQ","title":"Eminem - When I'm Gone","description":"Music video by Eminem performing When I'm Gone. (C) 2005 Aftermath Entertainment/Interscope Records.","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/1wYNFfgrXTI/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/1wYNFfgrXTI/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/1wYNFfgrXTI/hqdefault.jpg","width":480,"height":360}},"channelTitle":"EminemVEVO","liveBroadcastContent":"none"}}]
     */

    private String kind;
    private String etag;
    private String nextPageToken;
    private String regionCode;
    private PageInfoBean pageInfo;
    private List<ItemsBean> items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public PageInfoBean getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoBean pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class PageInfoBean {
        /**
         * totalResults : 1000000
         * resultsPerPage : 5
         */

        private int totalResults;
        private int resultsPerPage;

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public int getResultsPerPage() {
            return resultsPerPage;
        }

        public void setResultsPerPage(int resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }
    }

    public static class ItemsBean {
        /**
         * kind : youtube#searchResult
         * etag : "uQc-MPTsstrHkQcRXL3IWLmeNsM/fOatISocUPwQQB9jRbLVQNleHB0"
         * id : {"kind":"youtube#video","videoId":"_Yhyp-_hX2s"}
         * snippet : {"publishedAt":"2015-08-07T01:12:12.000Z","channelId":"UCstaTFTqZAC_OqfAq_JF6vA","title":"Eminem - Lose Yourself [HD]","description":"feat. Eminem from the movie 8 MILE No copyright infringement intended. All contents belong to its rightful owners. This is for entertainment purposes only.","thumbnails":{"default":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/hqdefault.jpg","width":480,"height":360}},"channelTitle":"msvogue23","liveBroadcastContent":"none"}
         */

        private String kind;
        private String etag;
        private IdBean id;
        private SnippetBean snippet;

        public String getKind() {
            return kind;
        }

        public void setKind(String kind) {
            this.kind = kind;
        }

        public String getEtag() {
            return etag;
        }

        public void setEtag(String etag) {
            this.etag = etag;
        }

        public IdBean getId() {
            return id;
        }

        public void setId(IdBean id) {
            this.id = id;
        }

        public SnippetBean getSnippet() {
            return snippet;
        }

        public void setSnippet(SnippetBean snippet) {
            this.snippet = snippet;
        }

        public static class IdBean {
            /**
             * kind : youtube#video
             * videoId : _Yhyp-_hX2s
             */

            private String kind;
            private String videoId;

            public String getKind() {
                return kind;
            }

            public void setKind(String kind) {
                this.kind = kind;
            }

            public String getVideoId() {
                return videoId;
            }

            public void setVideoId(String videoId) {
                this.videoId = videoId;
            }
        }

        public static class SnippetBean {
            /**
             * publishedAt : 2015-08-07T01:12:12.000Z
             * channelId : UCstaTFTqZAC_OqfAq_JF6vA
             * title : Eminem - Lose Yourself [HD]
             * description : feat. Eminem from the movie 8 MILE No copyright infringement intended. All contents belong to its rightful owners. This is for entertainment purposes only.
             * thumbnails : {"default":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/default.jpg","width":120,"height":90},"medium":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/mqdefault.jpg","width":320,"height":180},"high":{"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/hqdefault.jpg","width":480,"height":360}}
             * channelTitle : msvogue23
             * liveBroadcastContent : none
             */

            private String publishedAt;
            private String channelId;
            private String title;
            private String description;
            private ThumbnailsBean thumbnails;
            private String channelTitle;
            private String liveBroadcastContent;

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getChannelId() {
                return channelId;
            }

            public void setChannelId(String channelId) {
                this.channelId = channelId;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public ThumbnailsBean getThumbnails() {
                return thumbnails;
            }

            public void setThumbnails(ThumbnailsBean thumbnails) {
                this.thumbnails = thumbnails;
            }

            public String getChannelTitle() {
                return channelTitle;
            }

            public void setChannelTitle(String channelTitle) {
                this.channelTitle = channelTitle;
            }

            public String getLiveBroadcastContent() {
                return liveBroadcastContent;
            }

            public void setLiveBroadcastContent(String liveBroadcastContent) {
                this.liveBroadcastContent = liveBroadcastContent;
            }

            public static class ThumbnailsBean {
                /**
                 * default : {"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/default.jpg","width":120,"height":90}
                 * medium : {"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/mqdefault.jpg","width":320,"height":180}
                 * high : {"url":"https://i.ytimg.com/vi/_Yhyp-_hX2s/hqdefault.jpg","width":480,"height":360}
                 */

                @com.google.gson.annotations.SerializedName("default")
                private DefaultBean defaultX;
                private MediumBean medium;
                private HighBean high;

                public DefaultBean getDefaultX() {
                    return defaultX;
                }

                public void setDefaultX(DefaultBean defaultX) {
                    this.defaultX = defaultX;
                }

                public MediumBean getMedium() {
                    return medium;
                }

                public void setMedium(MediumBean medium) {
                    this.medium = medium;
                }

                public HighBean getHigh() {
                    return high;
                }

                public void setHigh(HighBean high) {
                    this.high = high;
                }

                public static class DefaultBean {
                    /**
                     * url : https://i.ytimg.com/vi/_Yhyp-_hX2s/default.jpg
                     * width : 120
                     * height : 90
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class MediumBean {
                    /**
                     * url : https://i.ytimg.com/vi/_Yhyp-_hX2s/mqdefault.jpg
                     * width : 320
                     * height : 180
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }

                public static class HighBean {
                    /**
                     * url : https://i.ytimg.com/vi/_Yhyp-_hX2s/hqdefault.jpg
                     * width : 480
                     * height : 360
                     */

                    private String url;
                    private int width;
                    private int height;

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }
                }
            }
        }
    }
}
