# [Bronze II] Key Maker - 14183

[문제 링크](https://www.acmicpc.net/problem/14183)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 273, 정답: 248, 맞힌 사람: 216, 정답 비율: 91.525%

### 분류

구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/14183.%E2%80%85Key%E2%80%85Maker/0fc60d9a.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14183/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-29%20%EC%98%A4%ED%9B%84%201.10.35.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:156px; width:164px" /></p>

<p>Hassan is a happy key maker. Every customer arrives with a safe-box key, and asks him to create some copies of the key. Each key has several cuts of different depths. The picture below shows a safe-box key with 3 cuts. To make a copy, Hassan needs to make the same number of cuts with exactly the same sequence of depths in a new blank key.</p>

<p>In the first days of his job, Hassan wasted many blank keys to make copies. Most of the copied keys, however, did not match the customer keys and he could not sell them. He collected those copied keys in a trash-box, and now he is thinking of recycling them.</p>

<p>When a new customer arrives, Hassan looks into the trash-box, collects all keys with the same number of cuts as the customer&rsquo;s key, and counts the keys that can match the customer&rsquo;s key. A key can match the customer&rsquo;s key if it already has exactly the same sequence of cut depths, or the depth of some of its cuts can be increased to reach the same sequence. Since this job is too hard for him, he has asked your help. For simplicity, you can assume that in any two keys with the same number of cuts, the position of the cuts along the keys are identical.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two space-separated integers m as the number of cuts in the customer&rsquo;s key (1 &le;&nbsp;m &le; 10), and n as the number of keys with the same number of cuts in the trash-box (1 &le; n &le; 100). The second line of the test case consists of m space-separated integers, as the depths of cuts in the customer&rsquo;s key. Each of the next n lines also contains m integers, as the depths of cuts in a trash-box key. The depth of cuts in each of these n + 1 keys are 1-digit positive integers given in the left-to-right order. The input terminates with a line containing 0 0 which should not be processed.</p>

### 출력

<p>For each test case, print a single line containing the number of keys in the trash-box that either match the customer&rsquo;s key or can be cut to match it.</p>