# [Platinum IV] Counting Self-Rotating Subsets - 13868

[문제 링크](https://www.acmicpc.net/problem/13868)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 40, 맞힌 사람: 32, 정답 비율: 68.085%

### 분류

수학, 자료 구조, 기하학, 집합과 맵, 조합론, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>A set of points in the plane is self-rotating if there is a point P, the center, and an angle &alpha;, expressed in degrees, where 0 &lt; &alpha; &lt; 360, such that the rotation of the plane, with center P and angle &alpha;, maps every point in the set to some point also in the set.</p>

<p>You are given a set of N distinct points, all having integer coordinates. Find the number of distinct subsets of size 1, 2, . . . , N that are self-rotating. Two subsets are considered distinct if one contains a point that the other does not contain.</p>

### 입력

<p>The first line of the input contains one integer N representing the number of points in the input set (1 &le; N &le; 1000). Each of the following N lines describes a different point of the set, and contains two integers X and Y giving its coordinates in a Cartesian coordinate system (&minus;10<sup>9</sup> &le; X, Y &le; 10<sup>9</sup> ). All points in the input set are distinct.</p>

### 출력

<p>Output a single line containing N integers S<sub>1</sub>, S<sub>2</sub>, . . . , S<sub>N</sub> . For i = 1, 2, . . . , N the integer S<sub>i</sub> must be the number of subsets of i points of the input set that are self-rotating. Since these numbers can be very big, output them modulo 10<sup>9</sup> + 7.</p>