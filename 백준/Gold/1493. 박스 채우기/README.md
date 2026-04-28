# [Gold II] 박스 채우기 - 1493

[문제 링크](https://www.acmicpc.net/problem/1493)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 8660, 정답: 2594, 맞힌 사람: 1791, 정답 비율: 29.448%

### 분류

수학, 그리디 알고리즘, 분할 정복

### 문제 설명

<p>세준이는 length &times; width &times; height 크기의 박스를 가지고 있다. 그리고 세준이는 이 박스를 큐브를 이용해서 채우려고 한다. 큐브는 정육면체 모양이며, 한 변의 길이는 2의 제곱꼴이다. (1&times;1&times;1, 2&times;2&times;2, 4&times;4&times;4, 8&times;8&times;8, ...)</p>

<p>세준이가 가지고 있는 박스의 종류와 큐브의 종류와 개수가 주어졌을 때, 박스를 채우는데 필요한 큐브의 최소 개수를 출력하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 세 자연수 length width height가 주어진다.</p>

<p>둘째 줄에 세준이가 가지고 있는 큐브의 종류의 개수 N이 주어진다.</p>

<p>셋째 줄부터 총 N개의 줄에 큐브의 종류 A<sub>i</sub>와&nbsp;개수 B<sub>i</sub>가 i가 증가하는 순서대로 주어진다. 큐브의 종류는 한 변의 길이를 나타낼 때 쓰는 2<sup>i</sup>에서 i이다.</p>

### 출력

<p>첫째 줄에 필요한 큐브의 개수의 최솟값을 출력한다. 만약 채울 수 없다면 -1을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; length, width, height &le; 10<sup>6</sup></li>
	<li>1 &le; n &le; 20</li>
	<li>0 &le; A<sub>i</sub> &lt; 20</li>
	<li>0 &le; B<sub>i</sub> &le; 10<sup>6</sup></li>
	<li>A<sub>i</sub> &ne; A<sub>j</sub> (i &ne; j)</li>
</ul>