# [Gold II] Geometric Sequence - 4145

[문제 링크](https://www.acmicpc.net/problem/4145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 3, 맞힌 사람: 2, 정답 비율: 22.222%

### 분류

많은 조건 분기, 수학

### 문제 설명

<p>A sequence of integers is called a geometric sequence if the ratio of consecutive numbers is constant.&nbsp;For example, (3,6,12,24) is a geometric sequence (each term is equal to twice the previous number).</p>

<p>Now, with such a sequence, we will shuffle it and remove some of the elements.&nbsp;Given the result of such a transformation, try to recover the &quot;geometric ratio&quot; of the original sequence, i.e. the ratio of consecutive numbers.</p>

<p>If there are multiple possible ratios, output the one with the greatest absolute value. If there is still a tie, output the positive one.&nbsp;If there is no such sequence, output 0.</p>

### 입력

<p>The first line of input contains a single integer, 2 &le; <em>N</em> &le; 100,000, the number of integers in the transformed sequence.<br />
Following this will be <em>N</em> lines, each containing a single integer of the transformed sequence (each element will be less than or equal to 10<sup>18</sup> in absolute value, and no element will be zero).</p>

### 출력

<p>The ratio of the original sequence (if one exists). The relative error of the answer must be within 10<sup>-9</sup>. That is, (abs(answer - expected) / expected &lt; 10<sup>-9</sup>).</p>