# [Gold III] Burrito King - 10590

[문제 링크](https://www.acmicpc.net/problem/10590)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 213, 정답: 64, 맞힌 사람: 49, 정답 비율: 30.435%

### 분류

그리디 알고리즘, 수학

### 문제 설명

<p>Two friends Albert and Barney came to the newly opened restaurant &ldquo;Burrito King&rdquo;. The restaurant had opened just yesterday, and Albert has got a special gift card, which allows the friends to get a free burrito. However, there is a constraint on the amount of ingredients &mdash; the burrito can contain at most gi grams of ingredient \(i\) for all \(i\) from 1 to \(n\).</p>

<p>There are two satisfaction parameters \(a_i\) and \(b_i\) for each ingredient &mdash; the amount of Albert&rsquo;s joy per gram of the corresponding ingredient, and the amount of Barney&rsquo;s unhappiness per gram, correspondingly.</p>

<p>Therefore, the total Albert&rsquo;s joy from the burrito is equal to:</p>

<p>\[\sum_{i=1}^{n}{s_i \cdot a_i}\]</p>

<p>The total Barney&rsquo;s unhappiness from the burrito is equal to:</p>

<p>\[\sum_{i=1}^{n}{s_i \cdot b_i}\]</p>

<p>Here \(s_i\) is the number of grams of the \(i\)-th ingredient in the burrito. Note, that \(s_i\) is not necessarily an integer, and 0 &le; \(s_i\) &le; \(g_i\).</p>

<p>Albert wants to make his total joy from the burrito to be at least \(A\). Barney is his best friend, so Albert wants Barney&rsquo;s total unhappiness to be no more than \(B\). Among all possible burritos that satisfy the above constrains, Albert wants to choose one that maximises his total joy.</p>

<p>Your task is to help Albert to choose \(s_i\) to satisfy these conditions or to find out that there is no solution.</p>

### 입력

<p>The first line contains three integers \(n\), \(A\), and \(B\) (1 &le; \(n\) &le; 100 000, 0 &le; \(A\), \(B\) &le; 10<sup>9</sup>), the number of ingredients, the least amount of Albert&rsquo;s joy and the maximal amount of Barney&rsquo;s unhappiness. Each of the following \(n\) lines contains a description of an ingredient: three integers \(g_i\), \(a_i\), \(b_i\) (0 &le; \(g_i\), \(a_i\), \(b_i\) &le; 100) &mdash; the maximal number of grams allowed, the amount of Albert&rsquo;s joy per gram and the amount of Barney&rsquo;s unhappiness per gram.</p>

### 출력

<p>The first line of the output must contain two real numbers &mdash; the maximal amount of his joy and the amount of Barney&rsquo;s unhappiness that Albert can obtain, satisfying the conditions in the problem statement, or &ldquo;&minus;1 &minus;1&rdquo;, if Albert cannot satisfy the conditions.</p>

<p>If the conditions are satisfiable the second line must contain \(n\) real numbers &mdash; the amount of each ingredient in grams.</p>

<p>Your output must have an absolute or relative error of at most 10&minus;8.</p>

<p>Any way to reach maximal Albert&rsquo;s joy that satisfies the given conditions can be printed.</p>