# [Silver V] Powering Teslopolis - 34418

[문제 링크](https://www.acmicpc.net/problem/34418)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 19, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

구현

### 문제 설명

<p>The city of Teslopolis is an interesting city, to say the least. Due to its location at the peak of the Stormlight Mountains, the entire city is always encompassed by storms, and its residents have invented an ingenious method of harnessing the perpetual lightning to power the city: electrical resonant transformers (ERT's).</p>

<p>The ERT's are placed at strategic locations throughout Teslopolis and act as both lightning rods and electrical generators that attract, ground, and harness the lightning's energy. Each ERT is connected to and powers all adjacent buildings (including diagonally adjacent). However, the city currently has no method for rapidly determining if all buildings would be powered given the layout of a new subdivision. As an intern for the city's current administration, your boss has instructed you to write an algorithm that determines, given the layout of a planned subdivision, if all buildings are powered.</p>

### 입력

<p>The first line of input is the number of rows in the planned subdivision, $1 \leq N \leq 30$, followed by the number of columns in the planned subdivision, $1 \leq M \leq 30$. Following the first two lines are $N$ lines of exactly $M$ buildings (represented by a "b") or ERT's (represented by a "T").</p>

### 출력

<p>Output "True" if all buildings are powered. Output "False" if any building is not powered.</p>

<p>If not all buildings are powered, output in numerical order the row and column index location of each unpowered building. Numerical ordering means you should sort first by the $x$ values and then by the $y$ values.  For example, if none of the locations are powered, you would print <code>0 0</code> followed by <code>0 1</code>, <code>0 2</code>, etc. until you reach the last row. Then, you would print <code>1 0</code>, <code>1 1</code>, etc. to repeat the pattern for all of the rows.</p>