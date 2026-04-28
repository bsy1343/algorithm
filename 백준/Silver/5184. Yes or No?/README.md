# [Silver II] Yes or No? - 5184

[문제 링크](https://www.acmicpc.net/problem/5184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 57, 맞힌 사람: 38, 정답 비율: 56.716%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Multiple choice tests are rather easy to grade, and therefore very popular among some teachers. Some students like them (&ldquo;you have a chance to get the answer right even if you have no clue&rdquo;), some students hate them (&ldquo;there must be a hidden catch somewhere&rdquo;). The ultimate form of multiple choice questions are true/false ones.</p>

<p>Now assume that you are taking a true/false test. For each question, you have an a priori estimate of how likely each of the two answers is right. For question i, you think that the answer is &ldquo;Yes&rdquo; with probability y<sub>i</sub>, and &ldquo;No&rdquo; with probability 1 &minus; y<sub>i</sub>. So of course, you should just pick whichever is higher between y<sub>i</sub> and 1 &minus; y<sub>i</sub> (if y<sub>i</sub> = 1/2, you could go either way).</p>

<p>The catch? If your estimate of &ldquo;Yes&rdquo; is higher than for &ldquo;No&rdquo; for all questions, you may suspect something is fishy. Most teachers don&rsquo;t like clear patterns in their answer key, and try to mix things up. Suppose that you know that this particular teacher always has a number of &ldquo;Yes&rdquo; answers between ℓ and r (inclusive), for some ℓ &le; r. Then, picking the set of questions to answer &ldquo;Yes&rdquo;, maximizing your total expected number of correct answers is not quite trivial any more. So you had better write a program to do it. Specifically, you want to find the answers to give to all questions so as to maximize the expected number of questions you get right, but giving the answer &ldquo;Yes&rdquo; at least ℓ and at most r times.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains three integers ℓ &le; r &le; n, where n &le; 200 is the total number of questions on the exam, ℓ is the minimum number of questions on which the answer will be &ldquo;Yes&rdquo;, and r the maximum number.</p>

<p>This is followed by n lines, each giving a fractional number yi &isin; [0, 1] for the corresponding question i.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum total number of questions you can get right subject to all the constraints, rounded to two decimals.</p>