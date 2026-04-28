# [Bronze I] PUTOVANJE - 11923

[문제 링크](https://www.acmicpc.net/problem/11923)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 298, 정답: 157, 맞힌 사람: 142, 정답 비율: 51.825%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>Young Mislav loves spending time in nature and, most of all, he loves spending time in forests. The fresh air and lovely sounds make the forest his favourite location. Mislav has decided to spend this afternoon in a forest and, because he&rsquo;s so practical, he&rsquo;s also decided to stuff himself with food. His belly can contain C amount of food.</p>

<p>He will have the opportunity to eat various fruits of nature (mushrooms, chestnuts, berries, and so on) while walking through the forest. All fruits are mutually different given their type and he&rsquo;d like to eat as much different fruits as possible, but with the condition that he doesn&rsquo;t overeat. In other words, the total weight of the fruits he&rsquo;s eaten must not be larger than C. Also, when Mislav decides to start eating, he tries to eat every next fruit if it&rsquo;s possible to eat it and not overeat. In the case when he doesn&rsquo;t have the capacity to eat it, he just moves on.</p>

<p>An array of weights of N fruits represents the weight and order of fruits that Mislav came across in the forest. Determine the maximum amount of different fruits that Mislav can eat.</p>

### 입력

<p>The first line of input contains two integers N and C (1 &le; N &le; 1 000, 1 &le; C &le; 1 000 000) from the task.</p>

<p>The second line contains N integers w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 1000) that represent the fruits&rsquo; weight.</p>

### 출력

<p>The first and only line of output must contain the maximum possible amount of different fruits that Mislav can eat.</p>

### 힌트

<p>Clarification of the first example: If Mislav decides to start eating from fruit (3), then he will have eaten 3 different fruits (3, 1, 1). If he starts eating from fruit (1), he will have eaten 4 fruits (1, 2, 1, 1).</p>