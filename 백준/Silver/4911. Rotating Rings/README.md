# [Silver II] Rotating Rings - 4911

[문제 링크](https://www.acmicpc.net/problem/4911)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 21, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p><span style="line-height:1.6em"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/4911.%E2%80%85Rotating%E2%80%85Rings/638c2e0d.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/4911.%E2%80%85Rotating%E2%80%85Rings/638c2e0d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4911/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:368px; width:114px" />Any square grid can be viewed as one or more rings, one inside the other. For example, as shown in figure (a), a 5 &lowast; 5 grid is made of three rings, numbered 1,2 and 3 (from outside to inside.) A square grid of size N is said to be sorted, if it includes the values from 1 to N</span><sup style="line-height:1.6em">2</sup><span style="line-height:1.6em"> in a row-major order, as shown in figure (b) for N = 4. We would like to determine if a given square grid can be sorted by only rotating its rings. For example, the grid in figure (c) can be sorted by rotating the first ring two places counter-clockwise, and rotating the second ring one place in the clockwise direction.</span></p>

### 입력

<p>Your program will be tested on one or more test cases. The first input line of a test case is an integer N which is the size of the grid. N input lines will follow, each line made of N integer values specifying the values in the grid in a row-major order. Note than 0 &lt; N &le; 1, 000 and grid values are natural numbers less than or equal to 1,000,000.</p>

<p>The end of the test cases is identified with a dummy test case with N = 0.</p>

### 출력

<p>For each test case, output the result on a single line using the following format:</p>

<p>k.␣result</p>

<p>Where k is the test case number (starting at 1,) ␣ is a single space, and result rings.(c|cpp|java) rings.in is &quot;YES&quot; or &quot;NO&quot; (without the double quotes.)</p>