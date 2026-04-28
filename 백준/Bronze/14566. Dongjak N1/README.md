# [Bronze I] Dongjak N1 - 14566

[문제 링크](https://www.acmicpc.net/problem/14566)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 399, 정답: 326, 맞힌 사람: 300, 정답 비율: 82.192%

### 분류

구현, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>You are the president of the company that runs the Chung Ang University shuttle bus. Students were able to use the bus to easily move the classroom. One day, the school expanded the campus by purchasing all the buildings in Heukseok - dong with your tuition. Because of this, you, the president of the shuttle bus operating company, must create a new line of buses to operate within the newly expanded campus.</p>

<p>Coincidentally, because of the president who wants to be tidy, the road that the newly built in campus are just two-line straight roads. There are no other roads. There are n stops on the campus roads.</p>

<p>For bus route development, you have numbered each of the n stops with an integer of A<sub>1</sub>, A<sub>2</sub>, A<sub>3</sub>, ..., A<sub>n-1</sub>, A<sub>n</sub>.</p>

<p>To move from one stop to another stop, you must go to the bus by all means. You want to design the bus route with less cost. However, if you do not leave a reasonable number of stops, students will be dissatisfied in your design. In this case, they will blame you, and you will be fired :). So, you decided to find the nearest stop among the n stops and merge them into one.</p>

<p>You majored in computer science and have decided to use n integers to number the bus stops. We decided to solve this problem by creating a program that finds the distance between two stops closest to the distance and calculates the number of pairs of two stops with this distance.</p>

### 입력

<p>In the first line, the number of stops (2 &le; n &le; 5000) is given.</p>

<p>In the second line, the coordinates A<sub>1</sub>, ..., A<sub>n</sub> (0 &le; A<sub>i</sub> &le; 32,800,000) of each stop are given. There is no duplicate of each number.</p>

### 출력

<p>Two integers are output, the first integer is the minimum distance and the second integer is the number of pairs of two stops with this distance.</p>

### 힌트

<p>Example 1. The minimum distance is 1, between the stop &#39;3&#39; and &#39;4&#39;. and we only have 1 pair with distance &#39;1&#39;.</p>

<p>Example 2. The minimum distance is 2, between the stop &#39;2&#39; and &#39;4&#39;. and we have 3 pairs with distance &#39;2&#39;, like (0,2), (2,4), (4,6).</p>