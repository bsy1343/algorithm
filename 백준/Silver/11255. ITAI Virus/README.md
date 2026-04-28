# [Silver IV] ITAI Virus - 11255

[문제 링크](https://www.acmicpc.net/problem/11255)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 94, 정답: 87, 맞힌 사람: 80, 정답 비율: 91.954%

### 분류

구현, 그래프 이론

### 문제 설명

<p>&ldquo;Insane Transferable Abnormal Illness&rdquo; or ITAI for short, is a new viral disease first discovered in a southern part of some city. The symptom is that persons contract with virus will continuously and uncontrollably scream &ldquo;Itai, itai!&rdquo;</p>

<p>When this virus was discovered at any city, it will perform binary division and spread through all roads connected to initial city. (The original city will have virus even though it has spread). But the ITAI virus is quite weak; after it has travelled to another city it will degenerate into &ldquo;weak virus&rdquo; that cannot spread anymore.</p>

<p>In a country, there is total of N cities, numbered from 1 to N, and has M road. The Ministry of Health has conducted an inspection and found this virus in K cities (All are new virus that can still spread)</p>

<p>To find out how many cities have virus after all virus has finished spreading.&nbsp;</p>

### 입력

<p>First line has number of question: T (1 ⩽ T ⩽ 10)</p>

<p>For question i (1 ⩽ i ⩽ T)</p>

<ul>
	<li>First line of question #i has three integer, N (number of city) M (number of road) and K (number that has virus) (1 ⩽ N ⩽ 1000; 1 ⩽ M ⩽ 2N; 0 ⩽ K ⩽ N)</li>
	<li>Next M lines of question #i has integer A and B, represent the road connecting city A to city B.</li>
	<li>Next line has K integers, each one is the initial cities found to have cirus.&nbsp;</li>
</ul>

### 출력

<p>Has T lines, each line have the total number of city that has virus for question #i.</p>

### 힌트

<p>T = 1</p>

<p>N = 4, M = 2, K = 1</p>

<p>There is virus in city #1.</p>

<p>Such, there is virus in #2, which cannot spread anymore.</p>

<p>So there are total of two cities with virus.</p>

<p>T = 2</p>

<p>N = 4, M = 3, K = 2</p>

<p>Virus in city #1 and #4.</p>

<p>Such, #1 create #2, and #4 create 3.</p>

<p>So all 4 has virus.</p>

<p>T = 3</p>

<p>N = 6, M = 3, K = 3</p>

<p>Virus in city #4 #6 and #2.</p>

<p>Such, #2 create #3, and #6 create 3. 4 has no roads.</p>

<p>So all 2 3 4 6 has virus, total of 4 cities.</p>