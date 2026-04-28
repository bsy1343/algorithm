# [Silver III] Recycling - 9955

[문제 링크](https://www.acmicpc.net/problem/9955)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 21, 맞힌 사람: 16, 정답 비율: 42.105%

### 분류

자료 구조, 브루트포스 알고리즘, 해시를 사용한 집합과 맵

### 문제 설명

<p>Kerbside recycling has come to New Zealand, and every city from Auckland to Invercargill has leapt on to the band wagon. The bins come in 5 different colours &mdash; red, orange, yellow, green and blue &mdash; and 5 wastes have been identified for recycling &mdash; Plastic, Glass, Aluminium, Steel, and Newspaper. Obviously there has been no coordination between cities, so each city has allocated wastes to bins in an arbitrary fashion. Now that the government has solved the minor problems of today (such as reorganising Health, Welfare and Education), they are looking around for further challenges. The Minister for Environmental Doodads wishes to introduce the &ldquo;Regularisation of Allocation of Solid Waste to Bin Colour Bill&rdquo; to Parliament, but in order to do so needs to determine an allocation of her own. Being a firm believer in democracy (well some of the time anyway), she surveys all the cities that are using this recycling method. From this she wishes to determine which allocation scheme (if imposed on the rest of the country) would cause the least impact, i.e. would cause the smallest overall number of changes to the current allocations.</p>

<p>Write a program that will read in a series of allocations of wastes to bins and then determine which allocation scheme, out of all possible schemes, will produce the fewest changes if adopted across the country. Note that there will always be a clear winner.&nbsp;</p>

### 입력

<p>Input will consist of a series of blocks. Each block will consist of a series of lines terminated by a line containing only a single #, and each line will contain a series of allocations in the form shown in the example. The entire file will also be terminated by a line consisting of a single #.</p>

### 출력

<p>Output will consist of a series of lines, one for each block in the input. Each line will consist of the allocation scheme that should be adopted as a national example. Bins should be listed in the order shown, i.e. red, orange, yellow, green, blue.</p>