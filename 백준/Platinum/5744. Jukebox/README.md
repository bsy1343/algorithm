# [Platinum IV] Jukebox - 5744

[문제 링크](https://www.acmicpc.net/problem/5744)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

비트마스킹, 다이나믹 프로그래밍, 그리디 알고리즘, 재귀

### 문제 설명

<p>The ICPC judges are preparing a party for the opening ceremony. For the party, they intend to add a playlist with some songs to the jukebox software (a simple MP3 player). However, there are so many songs in the computer that it is difficult to find the ones they want to add. As a consequence, they need to use the search feature many times.</p>

<p>In this jukebox, when you search for a string s, the software returns every music whose title or artist name contains s as a substring. String s is a substring of string t if t contains all characters of s as a contiguous sequence (for example, &lsquo;bc&rsquo; is a substring of &lsquo;abcd&rsquo;, but &lsquo;ac&rsquo; is not). To save their precious time, while looking for a song, they always use one of the song&rsquo;s golden string, i.e. one of the shortest strings for which the search returns as a result only the song they want.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5744.%E2%80%85Jukebox/c36e9b85.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5744.%E2%80%85Jukebox/c36e9b85.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5744/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:222px; width:521px" /></p>

<p>In the example above, a possible golden string for the song &lsquo;johnnatan&rsquo; is &lsquo;ta&rsquo;. Note that &lsquo;ta&rsquo; is not a substring of the name of another song nor a substring of the artist of another song. Note also that there is no string of size equal to 1 that could identify uniquely the song &lsquo;johnnatan&rsquo;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5744.%E2%80%85Jukebox/9ff08205.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5744.%E2%80%85Jukebox/9ff08205.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5744/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:223px; width:522px" /></p>

<p>They discovered that if they remove the artist fields from some of the songs they can get even smaller golden strings. For the song &lsquo;john&rsquo;, there is no golden string. However, if one removes the artist field from all other songs, the string &lsquo;c&rsquo; becomes the golden string for the song &lsquo;john&rsquo;.</p>

<p>Given the song list (each song with name and artist), your job is to determine the minimum sum of the golden string sizes for all songs that can be obtained if one is allowed to remove some of the artist fields. In the figure above you can see a possible best result with the golden strings in bold. The minimum sum of the golden string sizes in this case is 10.</p>

### 입력

<p>The input contains several test cases. The first line of each test case contains one integer N (1 &le; N &le; 30), which indicates the number of songs. Following there will be N pairs of lines (2 &lowast; N lines), one pair for each song. The first line of a pair will contain the song name, the second line will contain the artist name. Both artist and song names are strings containing only lower case letters or underlines and having at least 1 and at most 30 characters. There will be at most 6 different artists in the list.</p>

<p>The end of the input is given by N = 0.</p>

### 출력

<p>For each test case your program must output one single line with the minimum sum of the golden string sizes. You may assume that there will always be a solution.</p>