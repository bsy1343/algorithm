# [Silver IV] Earl’s Extremely Efficient Encryption - 13764

[문제 링크](https://www.acmicpc.net/problem/13764)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 29, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

구현, 정렬

### 문제 설명

<p>Earl has just finished writing an extremely efficient encryption algorithm for decreasing the size of video files. The algorithm has the capability to decrease the file size of a long video by many orders of magnitude. You can think of a video as a series of images.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13764.%E2%80%85Earl%E2%80%99s%E2%80%85Extremely%E2%80%85Efficient%E2%80%85Encryption/b67552a6.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13764/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%202.27.19.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:86px; width:630px" /></p>

<p>One simple algorithm is to store each of these images individually. The secret of Earl&rsquo;s algorithm is to only use the differences between successive images in the series. He stores each transition in a 32-bit integer (these values are called the transition integers). Using an unencrypted version of the first image and all of the transition integers, you can fully recreate the video.</p>

<p>The issue is that calculating the transition integers is lossy (i.e. the 32-bit integer representation of the transition is only an approximation of the actual differences of the images). This makes it possible for errors to occur and the image to display incorrectly. Each transition on its own has a very high probability of working correctly, but the probability of being able to play the whole video without an error occurring is quite low. Moreover, the errors compound onto one another since the differences between the images in the actual video may not make sense for any images that Earl&rsquo;s algorithm has generated incorrectly.</p>

<p>To account for this issue, the algorithm will not only store the first image of the video, but a subset of the images. At each transition, the algorithm will check if the true (unencrypted) image is stored. If it is, then that image is displayed on the screen. If it is not stored, then the algorithm will use the transition integer to generate the next image.</p>

<p>The badness of a video is defined as the largest number of consecutive transition integers used. Earl&rsquo;s algorithm works for all videos consisting of at most L images. Given the number of images in the video collection and the subset of images Earl will include unencrypted, what is the badness value for each video?</p>

### 입력

<p>The input will contain a single test case.</p>

<p>The input will begin with six integers: k (1 &le; k &le; 100), n (1 &le; n &le; 10<sup>5</sup> ), L (1 &le; L &le; 10<sup>9</sup> ), a (0 &le; a &le; L), b (0 &le; b &le; L) and g<sub>1</sub> (0 &le; g<sub>1</sub> &le; L). We then define g<sub>0</sub> = 0 and</p>

<p>g<sub>i</sub> = (a &middot; g<sub>i&minus;1</sub> + b) (mod L + 1) for all i &isin; {2, . . . , n}.</p>

<p>This is followed by k lines. The jth of these lines contains a single integer, w<sub>j </sub>(1 &le; w<sub>j</sub> &le; L), which represent the number of images in the jth video when it is stored uncompressed. The subset of images Earl includes unencrypted is</p>

<p>{g<sub>i </sub>: 0 &le; i &le; n} &cap; {0, 1, . . . , w<sub>j </sub>&minus; 1}.</p>

<p>The videos will be given in increasing order with respect to w<sub>j</sub> .</p>

### 출력

<p>Output the badness for each video.</p>

### 힌트

<p>In the first sample input, the unencrypted images included are 0, 2, 4, 6, 8 and 10. For the video of length 1, you do not need any transition integers, so the badness is 0. For the video of length 3, you only need a transition integer to get from image 0 to image 1. For the video of length 7, you need to use a single transition integer on 4 separate occasions (0 &rarr; 1, 2 &rarr; 3, 4 &rarr; 5, 6 &rarr; 7). For a video of length 14, you need to use a transition integer to generate image 11, 12 and 13 (which corresponds to a badness of 3).</p>