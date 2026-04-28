# [Silver III] Guess the Animal - 17029

[문제 링크](https://www.acmicpc.net/problem/17029)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 887, 정답: 444, 맞힌 사람: 365, 정답 비율: 54.315%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>When bored of playing their usual shell game, Bessie the cow and her friend Elsie like to play another common game called &quot;guess the animal&quot;.</p>

<p>Initially, Bessie thinks of some animal (most of the time, this animal is a cow, making the game rather boring, but occasionally Bessie is creative and thinks of something else). Then Elsie proceeds to ask a series of questions to figure out what animal Bessie has selected. Each question asks whether the animal has some specific characteristic, and Bessie answers each question with &quot;yes&quot; or &quot;no&quot;. For example:</p>

<pre>
Elsie: &quot;Does the animal fly?&quot; 
Bessie: &quot;No&quot; 
Elsie: &quot;Does the animal eat grass?&quot; 
Bessie: &quot;Yes&quot; 
Elsie: &quot;Does the animal make milk?&quot;
Bessie: &quot;Yes&quot; 
Elsie: &quot;Does the animal go moo?&quot;
Bessie: &quot;Yes&quot; 
Elsie: &quot;In that case I think the animal is a cow.&quot; 
Bessie: &quot;Correct!&quot;
</pre>

<p>If we call the &quot;feasible set&quot; the set of all animals with characteristics consistent with Elsie&#39;s questions so far, then Elsie keeps asking questions until the feasible set contains only one animal, after which she announces this animal as her answer. In each question, Elsie picks a characteristic of some animal in the feasible set to ask about (even if this characteristic might not help her narrow down the feasible set any further). She never asks about the same characteristic twice.</p>

<p>Given all of the animals that Bessie and Elsie know as well as their characteristics, please determine the maximum number of &quot;yes&quot; answers Elsie could possibly receive before she knows the right animal.</p>

### 입력

<p>The first line of input contains the number of animals, $N$ ($2 \leq N \leq 100$). Each of the next $N$ lines describes an animal. The line starts with the animal name, then an integer $K$ ($1 \leq K \leq 100$), then $K$ characteristics of that animal. Animal names and characteristics are strings of up to 20 lowercase characters (a..z). No two animals have exactly the same characteristics.</p>

### 출력

<p>Please output the maximum number of &quot;yes&quot; answers Elsie could receive before the game ends.</p>

### 힌트

<p>In this example, it is possible for Elsie to generate a transcript with  3 "yes"
answers (the one above), and it is not possible to generate a transcript with
more than 3 "yes" answers.