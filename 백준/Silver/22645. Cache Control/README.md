# [Silver I] Cache Control - 22645

[문제 링크](https://www.acmicpc.net/problem/22645)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 71, 맞힌 사람: 47, 정답 비율: 50.538%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Mr. Haskins is working on tuning a database system. The database is a simple associative storage that contains key-value pairs. In this database, a key is a distinct identification (ID) number and a value is an object of any type.</p>

<p>In order to boost the performance, the database system has a cache mechanism. The cache can be accessed much faster than the normal storage, but the number of items it can hold at a time is limited. To implement caching, he selected least recently used (LRU) algorithm: when the cache is full and a new item (not in the cache) is being accessed, the cache discards the least recently accessed entry and adds the new item.</p>

<p>You are an assistant of Mr. Haskins. He regards you as a trusted programmer, so he gave you a task. He wants you to investigate the cache entries after a specific sequence of accesses.</p>

### 입력

<p>The first line of the input contains two integers&nbsp;<i>N</i>&nbsp;and&nbsp;<i>M</i>.&nbsp;<i>N</i>&nbsp;is the number of accessed IDs, and&nbsp;<i>M</i>&nbsp;is the size of the cache. These values satisfy the following condition: 1 &le;&nbsp;<i>N</i>,&nbsp;<i>M</i>&nbsp;&le; 100000.</p>

<p>The following&nbsp;<i>N</i>&nbsp;lines, each containing one ID, represent the sequence of the queries. An ID is a positive integer less than or equal to 10<sup>9</sup>.</p>

### 출력

<p>Print IDs remaining in the cache after executing all queries. Each line should contain exactly one ID. These IDs should appear in the order of their last access time, from the latest to the earliest.</p>