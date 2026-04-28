# [Silver IV] Box - 7387

[문제 링크](https://www.acmicpc.net/problem/7387)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 89, 정답: 36, 맞힌 사람: 31, 정답 비율: 49.206%

### 분류

정렬, 많은 조건 분기

### 문제 설명

<p>Ivan works at a factory that produces heavy machinery. He has a simple job --- he knocks up wooden boxes of different sizes to pack machinery for delivery to the customers. Each box is a rectangular parallelepiped. Ivan uses six rectangular wooden pallets to make a box. Each pallet is used for one side of the box.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7387.%E2%80%85Box/ade01095.png" data-original-src="https://upload.acmicpc.net/32415344-a9a4-4848-920d-352e3c1df61c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 440px; height: 123px;" /></p>

<p>Joe delivers pallets for Ivan. Joe is not very smart and often makes mistakes --- he brings Ivan pallets that do not fit together to make a box. But Joe does not trust Ivan. It always takes a lot of time to explain Joe that he has made a mistake.</p>

<p>Fortunately, Joe adores everything related to computers and sincerely believes that computers never make mistakes. Ivan has decided to use this for his own advantage. Ivan asks you to write a program that given sizes of six rectangular pallets tells whether it is possible to make a box out of them.</p>

### 입력

<p>Input file consists of six lines. Each line describes one pallet and contains two integer numbers $w$ and $h$ ($1 \le w, h \le 10\,000$) --- width and height of the pallet in millimeters respectively.</p>

### 출력

<p>Write a single word &quot;<code>POSSIBLE</code>&quot; to the output file if it is possible to make a box using six given pallets for its sides. Write a single word &quot;<code>IMPOSSIBLE</code>&quot; if it is not possible to do so.</p>