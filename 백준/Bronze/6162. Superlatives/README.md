# [Bronze III] Superlatives - 6162

[문제 링크](https://www.acmicpc.net/problem/6162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1170, 정답: 533, 맞힌 사람: 463, 정답 비율: 46.533%

### 분류

수학, 구현

### 문제 설명

<p>Typically, droughts are classified into &ldquo;abnormally dry&rdquo;, &ldquo;moderate drought&rdquo;, &ldquo;severe drought&rdquo;, &ldquo;extreme drought&rdquo;, and &ldquo;exceptional drought&rdquo;. The current drought is so &ldquo;exceptional&rdquo; in most of California that there have been discussions of adding one or more steps to the scale. But really, that will only delay the problem. Any system of discrete labels is not completely scalable. As computer scientists, you know that the answer is to build a naming system that allows you to just add more and more syllables. So how about &ldquo;mega drought&rdquo;, &ldquo;mega mega drought&rdquo;, &ldquo;mega mega mega drought&rdquo;, and so on? You can extend it arbitrarily. Here, you&rsquo;ll write a program that finds the right number of &ldquo;mega&rdquo; to add.</p>

<p>You will be given two numbers: the amount of rain that was expected, and the amount of rain that actually occurred. If the former is less than the latter, we have no drought. If the expected rain is more than the actual rain, but not by a factor of more than 5, we just have a &ldquo;drought&rdquo;. If the expected rain is more by a factor of strictly more than 5, but not by a factor of more than 25, we have a &ldquo;mega drought&rdquo;. If it is more by a factor of strictly more than 25, but not by a factor more than 125, we have a &ldquo;mega mega drought&rdquo;. And so on &mdash; for each factor of 5, you add another &ldquo;mega&rdquo;.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>Each data set has two integer numbers 0 &le; E, A &le; 1, 000, 000, with A &gt; 0, the expected and actual amount of rain.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>Then output a string describing the type of drought that is going on (&ldquo;no drought&rdquo;, &ldquo;drought&rdquo;, &ldquo;mega drought&rdquo;, &ldquo;mega mega drought&rdquo;, etc.).</p>

<p>Each data set should be followed by a blank line.</p>