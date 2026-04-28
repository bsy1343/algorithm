# [Platinum V] Maximal Area - 11861

[문제 링크](https://www.acmicpc.net/problem/11861)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 778, 정답: 492, 맞힌 사람: 455, 정답 비율: 63.725%

### 분류

자료 구조, 세그먼트 트리, 분할 정복, 스택

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11861.%E2%80%85Maximal%E2%80%85Area/59aa022f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11861.%E2%80%85Maximal%E2%80%85Area/59aa022f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11861/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:248px; width:240px" />It is well known that building a hotel near sea coast is very profitable. That is why the company International Ocean Investment bought a piece of earth on the Black See coast (similar to shown on the Figure) and would like to build a hotel &ndash; as big as possible. By different reasons the hotel has to be with rectangular basement. That is why the company searches somebody to find the rectangle with maximal surface which could be drawn on the piece of earth. For the purpose the terrain was split in N columns of equal squares (white on the Figure). Columns are labeled with 1, 2, &hellip;, N consecutively, from left to right, and the rectangle should be composed of integer number of such squares. Then for each column the number of whole squares in the column was counted. Write a program maxarrea to find the surface of the maximal rectangle on the terrain that could be composed of squares.&nbsp;</p>

### 입력

<p>The first line of the standard input contains the positive integer N (N &le; 1 000 000). On the next row N integers are given D<sub>1</sub>, D<sub>2</sub>, &hellip;, D<sub>N</sub> &ndash; D<sub>I</sub> is the number of squares in the column I, 0 &lt; D<sub>I</sub> &le;&nbsp;15 000.</p>

### 출력

<p>The program has to print on the standard output the found maximal surface.&nbsp;</p>