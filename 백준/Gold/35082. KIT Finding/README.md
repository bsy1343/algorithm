# [Gold IV] KIT Finding - 35082

[문제 링크](https://www.acmicpc.net/problem/35082)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 23, 맞힌 사람: 21, 정답 비율: 84.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>"<em>Find the Fox</em>" is a recent book that contains $200$ pages of word search puzzles comprising only the letters '<code>F</code>', '<code>O</code>' and '<code>X</code>'. The special feature of the book is that there is only a single occurrence of the word "<code>FOX</code>" throughout all of its pages.</p>

<p>Recall that in a word search the goal is to find hidden words (only one hidden word in this case) in a grid of letters. The words can occur horizontally or vertically or diagonally, as well as forwards or backwards, allowing for a total of $8$ different reading directions.</p>

<p>For this year's NWERC, we want to create a baby version of "<em>Find the Fox</em>". Your goal in this problem, therefore, is to create a word search grid with given dimensions and containing each of the letters '<code>K</code>', '<code>I</code>' and '<code>T</code>' a given number of times. Similar to the original book, this grid should contain exactly one occurrence of the word "<code>KIT</code>".</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35082.%E2%80%85KIT%E2%80%85Finding/5082cfc1.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35082-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 82px;"></p>

<p style="text-align: center;">Figure K.1: Illustration of Sample Output 1. Flip page for the solution.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with five integers $h$, $w$, $k$, $i$, and $t$ ($3 \le h,w \le 100$, $k,i,t \ge 1$, $k+i+t = h\cdot w$), where $h$ and $w$ are the height and width the word search grid should have, and $k$, $i$, and $t$ specify the required number of occurrences of '<code>K</code>', '<code>I</code>' and '<code>T</code>', respectively.</li>
</ul>

### 출력

<p>Output a word search grid according to the given rules. It can be shown that such a word search grid always exists.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35082.%E2%80%85KIT%E2%80%85Finding/a1bcd2c9.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35082-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 82px;"></p>