# [Gold II] Martian DNA - 15862

[문제 링크](https://www.acmicpc.net/problem/15862)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 283, 정답: 117, 맞힌 사람: 96, 정답 비율: 48.980%

### 분류

이분 탐색, 두 포인터, 매개 변수 탐색

### 문제 설명

<p>As you are probably aware, human DNA can be represented as a long string over an alphabet of size four (A, C, G, T), where each symbol represents a distinct nucleobase (respectively; adenine, cytosine, guanine, and thymine).</p>

<p>For martians, however, things are a bit different; research conducted on the latest martian captured by NASA revealed that martian DNA consists of a whopping K distinct nucleobases! Martian DNA may thus be represented as a string over an alphabet of size K.</p>

<p>Now, a certain research group interested in exploiting martian DNA in artificial intelligence applications has requested to get a single consecutive piece of a martian DNA string. For R of the nucleobases, they have specified a minimum quantity of how many they need of that particular nucleobase to be present in their sample.</p>

<p>You are interested in finding the shortest substring of the DNA which satisfies their requirements.</p>

### 입력

<p>The first line contains three integers N, K, and R, denoting the total length of the martian DNA, the alphabet size, and the number of nucleobases for which the researchers have a minimum quantity requirement, respectively. They obey 1 &le; R &le; K &le; N.</p>

<p>The second line contains N space-separated integers: the complete martian DNA string. The i-th of these integers, D<sub>i</sub>, indicates what nucleobase is in the i-th position of the DNA string. Nucleobases are 0-indexed, i.e. 0 &le; D<sub>i</sub> &lt; K. Each nucleobase will occur at least once in the DNA string.</p>

<p>Each of the following R lines contains two integers B and Q representing a nucleobase and its mimimum required quantity, respectively (0 &le; B &lt; K, 1 &le; Q &le; N). No nucleobase will be listed more than once in these R lines.</p>

### 출력

<p>Output a single integer, the length of the shortest consecutive substring of the DNA that satisfies the researchers&rsquo; requirements. If no such substring exists, output &ldquo;impossible&rdquo;.</p>

### 힌트

<p>In the first sample, there are three substrings of length 2 that contain one each of nucleobases 0 and 1 (namely &ldquo;0 1&rdquo;, &ldquo;1 0&rdquo; and &ldquo;0 1&rdquo;), but no substrings of length 1. Thus the shortest length is 2.</p>

<p>In the second sample, the (unique) optimal substring is &ldquo;1 3 2 0 1 2 0&rdquo;.</p>

<p>In the third sample, there aren&rsquo;t enough nucleobases of type 0.</p>