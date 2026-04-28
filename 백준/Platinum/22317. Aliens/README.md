# [Platinum II] Aliens - 22317

[문제 링크](https://www.acmicpc.net/problem/22317)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 10, 맞힌 사람: 8, 정답 비율: 27.586%

### 분류

이분 탐색

### 문제 설명

<p>Mirko is a big fan of crop circles, geometrical formations of flattened crops that are supposedly of alien origin. One summer night he decided to make his own formation on his grandmother&rsquo;s meadow. The great patriot that he is, Mirko decided to make a crop formation that would have the shape of the shield part of the Croatian coat of arms, which is a 5&times;5 chessboard with 13 red squares and 12 white squares.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22317.%E2%80%85Aliens/a48109f7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22317.%E2%80%85Aliens/a48109f7.png" data-original-src="https://upload.acmicpc.net/20ae0a57-bfe4-44d5-b629-65d7e2b783e4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 157px; height: 156px;" /></p>

<p style="text-align: center;">The chessboard part of the Croatian coat of arms.</p>

<p>Grandma&rsquo;s meadow is a square divided into N&times;N cells. The cell in the lower left corner of the meadow is represented by the coordinates (1, 1) and the cell in the upper right corner is represented by (N, N).</p>

<p>Mirko decided to flatten only the grass belonging to red squares in the chessboard, leaving the rest of the grass intact. He picked an <strong>odd integer</strong> M &ge; 3 and flattened the grass so that each square of the chessboard comprises M&times;M cells in the meadow, and the chessboard completely fits inside the meadow.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22317.%E2%80%85Aliens/7191dd9a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22317.%E2%80%85Aliens/7191dd9a.png" data-original-src="https://upload.acmicpc.net/d27a7ed7-0d9d-4e1f-9a60-081dd1937eb2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 254px; height: 252px;" /></p>

<p style="text-align: center;">Example meadow and Mirko&#39;s crop formation, with N=19 and M=3. Cells with flattened grass are shown in gray.</p>

<p style="text-align: center;">The center of the formation is at (12, 9) and is marked with a black point.</p>

<p>After Mirko went to sleep, his peculiar creation drew the attention of real aliens! They are floating high above the meadow in their spaceship and examining Mirko&rsquo;s crop formation with a simple device. This device can only <strong>determine whether the grass in a particular cell is flattened or not</strong>.</p>

<p>The aliens have found <strong>one cell with flattened grass</strong> and now they want to find the <strong>center cell</strong> of Mirko&#39;s masterpiece, so that they may marvel at its beauty. They <strong>do not know the size M</strong> of each square in Mirko&#39;s formation.</p>

<p>Write a program that, given the size N (15 &le; N &le; 2 000 000 000) of the meadow, the coordinates (X<sub>0</sub>, Y<sub>0</sub>) of one cell with flattened grass, and the ability to interact with the alien device, finds the coordinates of the center cell of Mirko&rsquo;s crop formation.</p>

<p>The device may be used at most 300 times in one test run.</p>

### 입력



### 출력

