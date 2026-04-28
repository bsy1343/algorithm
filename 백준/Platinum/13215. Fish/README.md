# [Platinum IV] Fish - 13215

[문제 링크](https://www.acmicpc.net/problem/13215)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 54, 정답: 31, 맞힌 사람: 25, 정답 비율: 54.348%

### 분류

자료 구조, 누적 합, 세그먼트 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Kuching the Cat enjoys eating fish. However, he accidently bought a large fish and does not want to eat all of it. To solve his problem, he has subdivided the fish into N linear segments (head to tail) and has given each segment a &lsquo;satisfaction rating&rsquo;. These segments are labelled 1 to N. The higher the satisfaction rating, the more Kuching will enjoy eating this segment of the fish. However, fish only taste nice if eaten as a chunk. One chunk consists of multiple linear segments of fish that are contiguous/consecutive.</p>

<p>Kuching is very picky and will not enjoy a chunk of fish where the sum of satisfaction ratings is less than K (i.e. he wants the sum to be &ge; K). He wonders how many ways are there to cut a single chunk out of the fish such that he would enjoy eating. Those segments not part of the chunk will be thrown and not eaten</p>

<p>*To clarify: a chunk must contain at least 1 linear segment of fish and can only contain up to N segments in total (i.e. the entire fish)</p>

### 입력

<p>The first line of input will contain two 32-bit signed integers, N and K. Note that N will always be positive while K can take both positive and non-positive integers. (1 &le; N &le; 200,000)</p>

<p>The next line will be an array containing the satisfaction rating of the N segments. The i th integer will be the satisfaction rating of the i th segment of the fish. Do note that the satisfaction ratings will fit into a 32-bit signed integer and can take on positive and non-positive values.</p>

### 출력

<p>Output a single integer, the number ways there are to cut a single chunk out of the fish such that Kuching the Cat would enjoy eating (i.e. sum of satisfaction ratings &ge; K).</p>

### 힌트

<p>Sample Input 1</p>

<p>Kuching the Cat has divided the fish into 5 segments. The first segment has satisfaction rating 1, 2nd has rating -2, 3rd has rating 3, 4th has rating -4 and the 5th has rating 5.</p>

<p>He will only enjoy chunks of fish which the sum of satisfaction ratings is more than or equal to 2.</p>

<p>Hence, the six chunks that he will enjoy are: [1 -2 3], [1 -2 3 -4 5], [-2 3 -4 5], [3], [3 -4 5], [5]</p>

<p>No other possible chunks will have a sum of satisfaction ratings &ge; K.</p>

<p>Do note that [1 3 5] is not a valid chunk as they are not contiguous/consecutive.</p>

<p>&nbsp;</p>