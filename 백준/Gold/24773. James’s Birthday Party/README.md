# [Gold V] James’s Birthday Party - 24773

[문제 링크](https://www.acmicpc.net/problem/24773)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 141, 정답: 71, 맞힌 사람: 59, 정답 비율: 55.140%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24773.%E2%80%85James%E2%80%99s%E2%80%85Birthday%E2%80%85Party/daed91ef.png" data-original-src="https://upload.acmicpc.net/028b105f-cfa5-4e3c-9bb9-3b5b0c103d9e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 330px; height: 165px; float: right;" />James needs some help figuring out whether he can invite all of his friends to his birthday party. Luckily for James, he doesn&#39;t have to invite all of his friends by himself, because his friends will forward invitations to each other.</p>

<p>Consider this example: James has three friends: Lucy, Sue, and Mark. James is friends with all three of them, but unfortunately he doesn&#39;t have Mark&#39;s phone number so he can&#39;t invite him directly. However, Sue has Mark&#39;s number (and vice versa) so she can invite Mark to James&rsquo;s party.</p>

<p>The question that you need to answer is that if anyone lost one of the phone numbers for anyone else, would it be impossible to invite everybody to the party? Continuing the above example, if Sue lost Mark&#39;s number (the edge denoted by the red arrow above), then it would not be possible to invite everybody to the party. You should assume that if Sue loses Mark&#39;s number, then Mark will also lose Sue&#39;s number. Please help James figure out if he is at risk at having someone miss his party if any pair of friends loses contact with each other.</p>

### 입력

<p>The input will contain multiple test cases. Each test case contains on a single line two integer numbers p (1 &le; p &le; 100) and c (0 &le; c &le; 5000). p represents the number of people James wants to invite to the party, including himself. The next c lines represent the connections among James&rsquo;s friends represented as two integers a (0 &le; a &lt; p) and b (0 &le; b &lt; p), where a is not equal to b. This means that friend number a has friend number b&rsquo;s phone number and vice versa.</p>

<p>The input will be terminated by a line containing 2 zeros.</p>

### 출력

<p>For each test case, if a pair could lose each other&#39;s numbers and make it so that not everybody can be invited to the party, print &quot;Yes&quot;. Otherwise, print &quot;No&rdquo;.</p>