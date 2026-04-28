# [Platinum I] Watch Later - 17883

[문제 링크](https://www.acmicpc.net/problem/17883)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 12, 맞힌 사람: 12, 정답 비율: 41.379%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 부분집합의 합 다이나믹 프로그래밍

### 문제 설명

<p>While browsing YouTube videos, you commonly use the handy dandy tool that is Add Video to Watch Later. One day you finally decide that &lsquo;Later&rsquo; has finally arrived and you have SO many videos in your list.</p>

<p>You have a list of videos with different types. For example, some might be bouldering videos, some might be cat videos, and so on. You want to watch all videos of the same type before you watch videos of a different type, but you are allowed to watch the video types in any order you wish. For example, you might want to watch all bouldering videos before watching any cat videos.</p>

<p>To start watching, you have to click on a video to play it. You may click on any video in your list to start watching that video. Whenever a video finishes playing, it is automatically deleted from the list. The order of the remaining videos does not change when a video finishes playing. Also, the next video in the list is automatically played if it is of the same type as the video you just watched. If it is of a different type, or if there is no video after the one you just watched, you must click on another video in the list to watch more videos (unless you have watched all videos).</p>

<p>Given the description of your Watch Later list, what is the minimum number of clicks needed to watch every video with the restrictions described above?</p>

### 입력

<p>The first line of the input contains two integers n (1 &le; n &le; 400), the number of videos in your Watch Later list, and k (1 &le; k &le; 20), the number of different video types in the list.</p>

<p>The second line of input contains a string of length n which describes the Watch Later list. The i<sup>th</sup> character in the string is a lowercase English letter which describes the type of the i<sup>th</sup> video. Two videos are of the same type only if they are denoted by the same letter.</p>

### 출력

<p>Output a single integer on a line, indicating the minimum number of clicks required to watch all videos currently in your Watch Later list.</p>