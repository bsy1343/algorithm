# [Platinum III] Galatea’s Diet - 21038

[문제 링크](https://www.acmicpc.net/problem/21038)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 21, 맞힌 사람: 18, 정답 비율: 33.333%

### 분류

조합론, 분할 정복을 이용한 거듭제곱, 페르마의 소정리, 수학, 정수론

### 문제 설명

<p>There are <em>N</em> types of candy in this world, indexed 1 to <em>N</em>. For <em>M</em> consecutive days, Galatea will eat one candy every day. Eating two candies of the same type for two consecutive days is boring, so Galatea will avoid it.</p>

<p>As Galatea plans to participate in the Miss Galaxies contest, she should go on a diet. To comply with her goal, her beautician suggests Galatea to go on a specific diet. More precisely, Galatea will eat a candy of type <em>B<sub>i</sub></em> on the <em>A<sub>i</sub></em>-th day for 1 &le; <em>i</em> &le; <em>K</em>. She is free to eat any type of candy on the other days (outside the previously predetermined days).</p>

<p>Determine the number of possible eating configurations (diets) which satisfies Galatea&rsquo;s requirement (not eating two candies of the same type for any two consecutive days). Two eating configurations are different if there is a day which Galatea eats a different type of candy on that day. Since the output might be a very large number, output the remainder of the number when divided by 1,000,000,007.</p>

### 입력

<p>The first line contains three integers: <em>N</em> <em>M</em> <em>K</em> (1 &le; <em>N</em> &le; 1,000,000,000; 1 &le; <em>M</em> &le; 10<sup>18</sup>; 1 &le; <em>K</em> &le; min(<em>M</em>, 10,000)) in a line denoting the number of candy types, the number of days, and the number of days which the candy type is predetermined. The next <em>K</em> following lines, each contains two integers: <em>A<sub>i</sub></em> <em>B<sub>i</sub></em> (1 &le; <em>A<sub>i</sub></em> &le; <em>M</em>; 1 &le; <em>B<sub>i</sub></em> &le; <em>N</em>) denoting the predetermined candy types. <em>A<sub>i</sub></em> is guaranteed to be given in increasing order; in other words, <em>A<sub>i</sub></em> &lt; <em>A<sub>j</sub></em>, for all 1 &le; <em>i</em> &lt; <em>j</em> &le; <em>K</em>.</p>

### 출력

<p>The output contains the number of possible eating configurations that satisfies Galatea&rsquo;s requirement, in a line. Since the output might be a very large number, output the remainder of the number when divided by 1,000,000,007.</p>