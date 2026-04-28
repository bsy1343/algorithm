# [Platinum II] Unique Substrings - 16548

[문제 링크](https://www.acmicpc.net/problem/16548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

해 구성하기

### 문제 설명

<p>Create a string of N lowercase letters S<sub>1</sub>S<sub>2</sub> . . . S<sub>N</sub> where 1 &le; N &le; 2<sup>12</sup>. The string should have exactly K unique substrings.</p>

<p>A <em>substring</em> is the sequence of letters of the form S<sub>L</sub>S<sub>L+1</sub> . . . S<sub>R&minus;1</sub>S<sub>R</sub> for some 1 &le; L &le; R &le; N. Two substrings are the same if they are the same sequence of letters.</p>

### 입력

<p>Line 1 contains one integer K (1 &le; K &le; 2<sup>22</sup>). N is not given; the string that you create may have any number of letters N as long as 1 &le; N &le; 2<sup>12</sup>.</p>

### 출력

<p>Print one line with one string of N lowercase letters where 1 &le; N &le; 2<sup>12</sup>. It should have exactly K unique substrings. If there are multiple such strings, any will be accepted. It can be proven that such a string always exists with the given constraints of N and K.</p>

### 힌트

<p>For the first example, the 15 unique substrings of banana are <code>a</code>, <code>an</code>, <code>ana</code>, <code>anan</code>, <code>anana</code>, <code>b</code>, <code>ba</code>, <code>ban</code>, <code>bana</code>, <code>banan</code>, <code>banana</code>, <code>n</code>, <code>na</code>, <code>nan</code> and <code>nana</code>. Another string that has 15 unique substrings is <code>aaaaaaaaaaaaaaa</code> which would also be a correct output for the first example.</p>