# [Silver III] It Takes Three - 13755

[문제 링크](https://www.acmicpc.net/problem/13755)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 128, 정답: 68, 맞힌 사람: 40, 정답 비율: 51.282%

### 분류

브루트포스 알고리즘, 많은 조건 분기

### 문제 설명

<p>Given three rectangles, determine if they can be glued together to form a square. The rectangles can be rotated, but they cannot overlap.</p>

<p>Here&rsquo;s an example of how three rectangles, 8x2, 1x6 and 7x6, can be put together to form a square 8x8:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13755.%E2%80%85It%E2%80%85Takes%E2%80%85Three/88a2cd61.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13755/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%202.18.28.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:225px; width:225px" /></p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. There will be exactly three lines of input.</p>

<p>The first line of input contains two integers w1 and h1 (1 &le; w1,h1 &le; 100), which are the width and height of the first rectangle.</p>

<p>The second line of input contains two integers w2 and h2 (1 &le; w2,h2 &le; 100), which are the width and height of the second rectangle.</p>

<p>The third line of input contains two integers w3 and h3 (1 &le; w3,h3 &le;&nbsp;100), which are the width and height of the third rectangle.</p>

### 출력

<p>Output 1 if the two rectangles can be put together to form a square, and 0 of they cannot.</p>