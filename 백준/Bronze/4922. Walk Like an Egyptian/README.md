# [Bronze III] Walk Like an Egyptian - 4922

[문제 링크](https://www.acmicpc.net/problem/4922)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 758, 정답: 634, 맞힌 사람: 575, 정답 비율: 85.059%

### 분류

수학, 구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/4922.%E2%80%85Walk%E2%80%85Like%E2%80%85an%E2%80%85Egyptian/e07b02df.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/4922/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-10%20%EC%98%A4%ED%9B%84%206.11.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:276px; width:111px" /></p>

<p>Walk Like an Egyptian is an old multi-player board game played by children of the Sahara nomad tribes. Back in the old days, children would collect stones, and number each one of them. A game with N players requires N2 stones. Each player chooses N stones. The stones are then laid out on an N &times; N grid in a peculiar order as in Figure (a) (for N = 4.) The player whose stone is placed in the top-right corner loses the round. Another round is then played but with N &minus; 1 players. In total, N &minus; 1 rounds are played to determine the winner.</p>

<p>There is a story why the stones are arranged in this order. It is said that back in the days of the Pharaohs, when entering a dark room in a Pyramid, workers would use the following &ldquo;algorithm&rdquo; to be able to walk in the room without losing anybody: (see Figure (b)).</p>

<p>1. The first worker stands in the lower-left corner of the room.<br />
2. The next three workers stand around the first forming a quarter of a circle by going in an anti-clockwise direction.<br />
3. The next five workers stand around the last three, again forming a quarter of a circle but this time going in a clockwise direction.<br />
4. The workers keep repeating the last two steps until the room is filled with workers. Each time they hit the left or bottom walls, they start a larger quarter circle and alternate their direction between clockwise and anti-clockwise.</p>

<p>Write a program that determines the stone placed on the top-right corner.</p>

### 입력

<p>Your program will be tested on one or more test cases. Each test case is specified on a separate input line. Each test case will specify the number of players N where 0 &lt; N &lt; 1, 000.</p>

<p>The end of the test cases is indicated by a line made of a single zero.</p>

### 출력

<p>For each test case, output the result on a single line using the following format:</p>

<p>N␣=&gt;␣result</p>

<p>Where N is the number of players for the this test case, and result is the number on the stone placed at the top-right corner of the grid.</p>