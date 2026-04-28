# [Platinum V] Vera and Sorting - 15442

[문제 링크](https://www.acmicpc.net/problem/15442)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>Vera is very smart and invented a new sorting algorithm. She coded the following Python function to count how many steps her algorithm takes.</p>

<pre class="brush:python; toolbar:false;">
def steps(array):
  if len(array) == 0:
    return 0
  pivot = array[0]
  count = 0
  lesser = []
  greater = []
  for element in array: ## looks at each element in the array
    count += 1
    if element &lt; pivot:
      lesser.append(element) ## e.g. [1,3].append(5) =&gt; [1,3,5]
    elif element &gt; pivot:
      greater.append(element)
  return count + steps(lesser) + steps(greater)</pre>

<p>A permutation P is an ordered set of integers P<sub>1</sub>, P<sub>2</sub>, &middot; &middot; &middot; , P<sub>N</sub> , consisting of N distinct positive integers, each of which are at most N. We will call the number N the size of the permutation.</p>

<p>You are given integers N and K.</p>

<p>Help Vera count the number of permutations P of size N such that steps(P) returns the value K. This number could be large, so output it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The input will be in the format:</p>

<pre>
N K</pre>

<p>Constraints:</p>

<ul>
	<li>1 &le; N &le; 30</li>
	<li>1 &le; K &le; 900</li>
	<li>N, K are integers</li>
</ul>

### 출력

<p>Output one integer, the number of possible permutations, modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>For the first example, the 2 valid permutations are 2, 1, 3 and 2, 3, 1.</p>