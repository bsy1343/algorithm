# [Gold III] Obélix - 20269

[문제 링크](https://www.acmicpc.net/problem/20269)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

(분류 없음)

### 문제 설명

<p>Ob&eacute;lix is a big eater. Everybody knows that, even the president of the Bureau des &Eacute;l&egrave;ves. He eats wild boar every day. But only a few people know that he is also a fine diner. In fact, Ob&eacute;lix never cooks his meat according to the same recipe twice. He keeps all the recipes he might want to try one day in an old book. Every recipe comes with a list of required ingredients to prepare the dish. He has even rated each recipe, in the form of a grade, according to how good he believes the dish will taste. In his kitchen pantry, he has all the required ingredients in unlimited quantities. The only drawback is that the ingredients will eventually lose their freshness and spoil as all the items of a given ingredient have the same expiration date.</p>

<p>In the coming days, Ob&eacute;lix would like to prepare a different dish every day in order to maximize the total grade of all the dishes he cooks, while never using an expired ingredient. Ast&eacute;rix is fortunate enough to be his guest every day, but they will have a hard time figuring out how to choose which dish to cook. Can you help?</p>

### 입력

<p>The input consists of multiple test cases. The first line of the input consists of an integer indicating the number of test cases. The first line of each test case consists of three integers $n$ ($1\le n \le 100000$), $i$ ($1\le i \le 100000$) and $r$ ($1\le r \le 100000$) separated by single spaces: $n$ indicates the number of days during which Ob&eacute;lix will cook (the days are numbered from $1$ to $n$), $i$ is the number of ingredients (numbered from $1$ to $i$), and $r$ is the number of recipes in the book. The second line consists of $i$ integers separated by single spaces: for $1 \leq j \leq i$, the $j$<sup>th</sup> integer $1 \leq e_j \leq 100000$ indicates the day on which the ingredient will expire (i.e., the last day when it can be used). The test cases finish with $r$ lines, one for each recipe, with the $k$<sup>th</sup>&nbsp;of these lines for $1 \leq k \leq r$ consisting of integers separated by single spaces: a first integer $1 \leq g_k \leq 100$ giving the grade of the recipe, a second integer $1 \leq l_k \leq 10$ giving the number of ingredients of the recipe, and $l_k$ distinct integers giving the required ingredients, each of which is between $1$ and $i$.</p>

### 출력

<p>For each test case, your program should output the maximum sum of the grades of recipes that Obelix can cook over the $n$ days, subject to the constraint that each recipe can be cooked at most once and that a recipe cannot be cooked on a day where one of its ingredients is past its expiration date.</p>