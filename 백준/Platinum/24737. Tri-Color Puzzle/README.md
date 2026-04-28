# [Platinum II] Tri-Color Puzzle - 24737

[문제 링크](https://www.acmicpc.net/problem/24737)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 13, 맞힌 사람: 9, 정답 비율: 45.000%

### 분류

수학, 선형대수학, 가우스 소거법

### 문제 설명

<p>A <strong>Tri-Color Puzzle</strong> is a triangular array of hexagon cells with S cells on each side for a total of N = (S*(S+1))/2 cells. For example, the following is a puzzle with side 4 and 10 cells.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/8fb44308.png" data-original-src="https://upload.acmicpc.net/e6c857c0-f3fb-465f-a955-da219b523622/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 87px; height: 76px;" /></p>

<p>To solve the puzzle, each cell must be colored red, green or blue so that for each triplet of cells with one cell above and two cells below, either all of the three cells are the same color or each of the three cells is a different color. For the purposes of this problem statement, we will also use hash patterns as well as colors for clarity as follows:</p>

<p>Red = <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/25f56fe2.png" data-original-src="https://upload.acmicpc.net/43fbbc88-7f44-4c7e-ac50-94b91582d119/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 27px; height: 30px;" />&nbsp;Green = <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/cd86cca7.png" data-original-src="https://upload.acmicpc.net/9c023143-3986-45a8-a20c-36ee35cf36ea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 26px; height: 30px;" />&nbsp;Blue =&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/f2db9b64.png" data-original-src="https://upload.acmicpc.net/af1bc28e-9fa0-48ea-8c2b-06fd5587d310/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 27px; height: 30px;" /></p>

<p>In a particular puzzle, some of the cells will be initially specified and the remaining cells are to be filled in as described above. The following example has three solutions:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/d9140590.png" data-original-src="https://upload.acmicpc.net/31bf6a9c-b099-43a0-9f59-3a56dea05a16/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 489px; height: 85px;" /></p>

<p>This example has no solutions:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/6ad284e2.png" data-original-src="https://upload.acmicpc.net/9f9924a4-822c-4663-b7b2-b75f88b0fac2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 94px; height: 89px;" /></p>

<p>This example has exactly one solution:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24737.%E2%80%85Tri-Color%E2%80%85Puzzle/92d36114.png" data-original-src="https://upload.acmicpc.net/76e54c33-fb48-4eac-8b4c-ef665dc39d73/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 334px; height: 92px;" /></p>

<p>Write a program which takes as input a description of a <strong>Tri-Color puzzle</strong> and outputs the number of solutions to the puzzle.</p>

### 입력

<p>Input consists of multiple lines of input. The first line contains 2 space separated decimal integers, S and I, (3 &le; S &le; 19) and (0 &le; I &le; N = (S*(S+1))/2), The first line is followed by I lines of three decimal integers giving the row, r, the cell in the row, c, and the color code cc for one initial cell color (1 &le; r &le; S), (1 &le; c &le; r) and (0 &le; cc &le; 2) where 0 =&gt; red, 1 =&gt; green and 2 =&gt; blue.</p>

### 출력

<p>The single output line consists of the number of solutions to the <strong>Tri-color puzzle</strong> specified by the input.</p>