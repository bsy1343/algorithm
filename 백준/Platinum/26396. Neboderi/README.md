# [Platinum II] Neboderi - 26396

[문제 링크](https://www.acmicpc.net/problem/26396)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 29, 맞힌 사람: 28, 정답 비율: 42.424%

### 분류

수학, 자료 구조, 정수론, 집합과 맵, 누적 합, 스택, 소인수분해

### 문제 설명

<p>Domagoj is in the big city of London! Right now, there is a sequence of tall skyscrapers in front of him and he wants to take a photograph to remember the moment.</p>

<p>The sequence of skyscrapers can be represented as a sequence of n numbers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> where the number hi represents the height of the i-th skyscraper. Domagoj will photograph a contiguous subsequence of skyscrapers. To capture more of the city&rsquo;s beauty, he wants to photograph at least k skyscrapers.</p>

<p>Domagoj has a strange sense of beauty of a photograph. He is very happy when there are tall skyscrapers in the photograph, but he is even happier when their heights have a large common divisor! If we label the heights of the contiguous skyscrapers on the photograph with h<sub>l</sub>, . . . , h<sub>r</sub>, and with g the greatest common divisor of the selected heights, then Domagoj defines the beauty of the photograph as g &middot; (h<sub>l</sub> + . . . + h<sub>r</sub>).</p>

<p>Help Domagoj determine the beauty of the most beautiful photograph with at least k skyscrapers!</p>

### 입력

<p>The first line contains two integers n, k (1 &le; k &le; n &le; 10<sup>6</sup>), the number of skyscrapers, and the number k.</p>

<p>The second line contains n integers h<sub>1</sub>, h<sub>2</sub>, . . . , h<sub>n</sub> (1 &le; h<sub>i</sub> &le; 10<sup>6</sup>), the heights of the skyscrapers, in order.</p>

### 출력

<p>Print a single line with the required number from the task.</p>

### 힌트

<p>Clarification of the first example: Domagoj photographed skyscrapers ( 4, 4, 4 ), so the total beauty is 4 &middot; (4 + 4 + 4) = 48</p>

<p>Clarification of the second example: Domagoj photographed only the skyscraper ( 9 ), so the total beauty is 9 &middot; 9 = 81.</p>