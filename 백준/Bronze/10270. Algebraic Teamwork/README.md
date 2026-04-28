# [Bronze I] Algebraic Teamwork - 10270

[문제 링크](https://www.acmicpc.net/problem/10270)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 311, 정답: 230, 맞힌 사람: 175, 정답 비율: 76.087%

### 분류

수학, 조합론

### 문제 설명

<p>The great pioneers of group theory and linear algebra want to cooperate and join their theories. In group theory, permutations &ndash; also known as bijective functions &ndash; play an important role. For a finite set A, a function &sigma; : A &rarr; A is called a permutation of A if and only if there is some function &rho; : A &rarr; A with</p>

<p style="text-align: center;">&sigma;(&rho;(a)) = a and &rho;(&sigma;(a)) = a for all a &isin; A.</p>

<p>The other half of the new team &ndash; the experts on linear algebra &ndash; deal a lot with idempotent functions. They appear as projections when computing shadows in 3D games or as closure operators like the transitive closure, just to name a few examples. A function p : A &rarr; A is called idempotent if and only if</p>

<p style="text-align: center;">p(p(a)) = p(a) for all a &isin; A.</p>

<p>To continue with their joined research, they need your help. The team is interested in non-idempotent permutations of a given finite set A. As a first step, they discovered that the result only depends on the set&rsquo;s size. For a concrete size 1 &le; n &le; 10<sup>5</sup>, they want you to compute the number of permutations on a set of cardinality n that are not idempotent.</p>

### 입력

<p>The input starts with the number t &le; 100 of test cases. Then t lines follow, each containing the set&rsquo;s size 1 &le; n &le; 10<sup>5</sup>.</p>

### 출력

<p>Output one line for every test case containing the number modulo 1 000 000 007 = (10<sup>9</sup> + 7) of non-idempotent permutations on a set of cardinality n.</p>