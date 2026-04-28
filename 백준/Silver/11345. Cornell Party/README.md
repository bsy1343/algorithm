# [Silver IV] Cornell Party - 11345

[문제 링크](https://www.acmicpc.net/problem/11345)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 141, 정답: 101, 맞힌 사람: 61, 정답 비율: 65.591%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>One-hundred and fifty years ago, Ezra Cornell and A. D. White hosted a party in the newly opened Cornell University. They were at the door greeting people as they came, and they also made notes of who was coming in. This party was very peculiar in that a guest could pass through the door several times, and by doing so, would be counted by Cornell and White multiple times. They were very smart men, so knowing that this could happen, they mentally assigned a number to each invited guest, so every time a guest entered the door both Cornell and White would make note of the ID of that guest. They had very good memory, so they wouldn&rsquo;t write the ID down at the moment a guest comes in. As a consequence, their lists not necessarily are in the order of arrival.</p>

<p>At the end they compared their notes and realized they were completely different. They immediately understood what was going on. Cornell and White assigned different IDs for the same person. While Cornell would say that John Smith is person 5, White would say that he is person 8, for example. They are not convinced that this was their only mistake, though. Can you help them?</p>

<p>Your task is to tell Cornell and White if their only mistake was to give different IDs to the same person, or if one of them got something wrong. For instance, if Cornell&rsquo;s list is: &ldquo;1 3 1&rdquo; and White&rsquo;s list is &ldquo;5 5 6&rdquo;, it can be the case that Cornell&rsquo;s person 1 is White&rsquo;s person 5, and Cornell&rsquo;s person 3 is White&rsquo;s person 6. In this case their only mistake was using different IDs. On the other hand if the lists are &ldquo;1 1 1&rdquo; and &ldquo;1 2 3&rdquo; there is no way that they didn&rsquo;t make any other mistake.</p>

### 입력

<p>The input consists of several test cases. The input starts with the number of test cases. Each test case starts with the number N of names in the lists. The following line will contain all the N numbers in Cornell&rsquo;s list, and the next line will contain all the N numbers in White&rsquo;s list. 1 &le; N &le; 100,000, and each number inside the lists is between 1 to 1,000,000 (inclusive).</p>

### 출력

<p>For each test case, your output should be &ldquo;what a lovely party&rdquo; in case their only mistake was to give different IDs or &ldquo;you&rsquo;ve messed up, Cornell&rdquo;, otherwise.</p>