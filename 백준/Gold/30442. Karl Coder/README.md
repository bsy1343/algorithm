# [Gold IV] Karl Coder - 30442

[문제 링크](https://www.acmicpc.net/problem/30442)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 102, 정답: 34, 맞힌 사람: 28, 정답 비율: 31.111%

### 분류

이분 탐색

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30442.%E2%80%85Karl%E2%80%85Coder/3b1bb2e8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30442.%E2%80%85Karl%E2%80%85Coder/3b1bb2e8.png" data-original-src="https://upload.acmicpc.net/59430462-57ba-494f-9f20-6b32a110ad33/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 121px; float: right;" />Karl is an aspiring C programmer, and is excited by the risks and rewards of low-level manual memory management. In the program he currently develops, he stores a string containing $N$ non-zero bytes into a buffer named &quot;<code>buf</code>&quot;. By mistake he accidentally made the buffer $2 N$ bytes in size. The last $N$ bytes of the buffer consists of only zero-bytes.</p>

<p>Now Karl needs to know the value $N$, the size of the string, in a separate part of the program. Traditionally you would recover the length of a string using the <code>strlen</code>-function, which reports the position of the first zero-byte in the provided buffer using a linear scan. However, Karl finds that this is much too slow, and that it defeats the advantage of using C in the first place. Can you help Karl efficiently recover $N$ without crashing his program?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30442.%E2%80%85Karl%E2%80%85Coder/c4eca645.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30442.%E2%80%85Karl%E2%80%85Coder/c4eca645.png" data-original-src="https://upload.acmicpc.net/9f4d17ff-e504-4a76-b6db-912b880b83a9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 429px; height: 50px;" /></p>

<p style="text-align: center;">The contents of the buffer in sample interaction 3 are shown here.</p>

### 입력



### 출력

