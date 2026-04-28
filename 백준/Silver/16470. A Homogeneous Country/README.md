# [Silver III] A Homogeneous Country - 16470

[문제 링크](https://www.acmicpc.net/problem/16470)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 360, 정답: 143, 맞힌 사람: 112, 정답 비율: 40.727%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Many Westerners think Korea is a mere Eastern country which hangs like a grapefruit next to China. However, Koreans have kept their unique ethnicity, struggling all the time not to be &quot;a shrimp among whales&quot;; Chinese to the west, Japanese to the east, &quot;barbarian&quot; tribes, and expanding Russia to the north. Bruce Cumings argued that a vast majority of Koreans look through the lens of race, thinking they have some essential quality making them and only them real Koreans, tracing a unique, homogeneous bloodline back some five thousand years, a story called Tan-gun mythology; &#39;Koreans do this, Koreans do that&#39; in a shorthand. After a fratricidal war, it was divided into North and South Korea, creating Demilitarized Zone. South Korea had no friend in the region and became a de facto island. During the Cold War, Communist countries supported its enemy, North Korea, and Japan was the last candidate because of their colonial history. Its extremely low ethnic diversity(158<sup>th</sup> out of 159 countries; North Korea ranked 159<sup>th</sup>) and cultural diversity(152<sup>nd</sup>)&nbsp;is understandable given its experience of occupation and war.</p>

<p>Though the homogeneity of South Korea played a crucial role in the miracle of its economic development, it has also been a growing concern. A certain amount of diversity is necessary to encourage to understand different perspectives within the society and dispel negative stereotypes and personal biases about different groups. Learning about others helps to recognize and respect minorities, which we all are in some categories. Better understanding leads to the facilitation of collaboration and cooperation in the workplace.</p>

<p>The lack of other diversities left solely one inevitable diversity&mdash;gender&mdash;and called forth the recent fierce conflict between two traditional genders in South Korea, where only men are subject to two years of the savage conscription and its aftermath and women struggle with deeply imbued Confucianism, 37% of wage gap, and the paucity of sister politicians. Another recent case, Yemeni refugees, reveals a deeper nuance. In spite of the prevailing grievance over asylum seekers around the world, a polling estimates that between 49% and 56% of the general Korean population oppose granting asylum to the Yemeni refugees. But in a surprising result, the opposition among Korean youth in their 20s and 30s are considerably higher&mdash;70% and 60% respectively, despite the increased number of lawful foreigners in the country.<em><sup>&nbsp;</sup></em>The discord between men and women has contributed to avoiding marriage among youngsters, lowering overall fertility rate, a staggering figure of 0.96 in 2018. Now, for Koreans, embracing outsiders is not only a matter of morality or economic growth but also a matter of their survival in the future.</p>

<p>Jason, writing an essay about this issue, wants to exemplify the heterogeneity of the groups around him. You are asked to provide a program to calculate the heterogeneity of a group. He decided to use Gini-index. It is defined as, $1 - \sum_{j=1}^{n} p_j^2$, where $p_j$&nbsp;is the relative frequency of class $j$. Let&#39;s help him out.</p>

### 입력

<p>The class&nbsp;of an entity,&nbsp;$C_i$, is given line by line. For all $i$, $C_i$ consists only of alphabets and is case-sensitive,&nbsp;and its length is not longer than 10.</p>

<p>The number of entities, $m$,&nbsp;is not greater than 100,000.</p>

### 출력

<p>Print Gini-index of the given group. Its relative error or absolute error must be less than $10^{-6}$.</p>

### 힌트

<p>In the first case, the relative frequency of Korean is $9/10=0.9$ and that of Chinese is $1/10=0.1$. Hence, Gini-index is $1 - (0.9^2 + 0.1^2) = 0.18$</p>

<p>In the second case, $1 - 4 \times (1 / 4)^2 = 0.75$</p>