# [Platinum V] Parking Lot - 24583

[문제 링크](https://www.acmicpc.net/problem/24583)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 16, 맞힌 사람: 14, 정답 비율: 41.176%

### 분류

다이나믹 프로그래밍, 그래프 이론, 기하학, 최단 경로, 데이크스트라, 두 포인터, 선분 교차 판정

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24583.%E2%80%85Parking%E2%80%85Lot/5a2d6d04.png" data-original-src="https://upload.acmicpc.net/07709525-fe44-4c73-8faa-3d550db211eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 242px; height: 242px; float: right;" />Walking across a huge parking lot is not only time consuming but also challenging because cars block your way and you may even get lost!</p>

<p>Imagine you are walking across a parking lot of r rows and c columns of parking spots. All parking spots have a size of a unit square. A parking spot either is empty or contains a parked car. You can walk across an empty parking spot in any direction, but can only walk along the boundaries of a parking spot if there&rsquo;s a parked car in it. You start at the top-left corner of the parking lot and walk at a constant speed of one unit distance per second. If you pick the fastest route, in how many seconds can you walk to the bottom-right corner of the parking lot?</p>

<p>The image illustrates two possible routes for the parking lot in the first sample case. The blue route is the fastest route in this case. The red route shows that you can walk along the boundaries of parked cars.</p>

### 입력

<p>The first line of input has two integers r and c (1 &le; r, c &le; 50). The next r lines each have a string of c characters giving one row of parking spots from top to bottom. A dot &lsquo;<code>.</code>&rsquo; indicates an empty parking spot and a hash &lsquo;<code>#</code>&rsquo; indicates a parking spot with a parked car.</p>

### 출력

<p>Output the smallest amount of time in seconds you need to walk to the bottom-right corner of the parking lot. Your answer is considered correct if it has an absolute or relative error of at most 10<sup>&minus;6</sup> from the correct answer.</p>