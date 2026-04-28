# [Gold II] Lazy Jumping Frog - 5743

[문제 링크](https://www.acmicpc.net/problem/5743)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 86, 정답: 27, 맞힌 사람: 24, 정답 비율: 32.000%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 차분 배열 트릭

### 문제 설명

<p>Mr. Frog lives in a grid-like marsh of rectangular shape, composed of equally-sized cells, some of which are dry, some of which are only watery places.</p>

<p>Mr. Frog lives in a dry cell and can jump only from a dry cell to another dry cell on his wanderings around the marsh. Mr. Frog wants to visit his girlfriend, Ms. Toad, who also lives in a dry cell in the same marsh. But Mr. Frog is lazy, and wants to spend the minimum amount of energy in his jumping way to Ms. Toad&rsquo;s home. Mr. Frog knows how much energy he spends in any of his jumps. For any single jump, Mr. Frog always uses the following figure to determine which are the possible target cells from his current position (the cell marked F), and the corresponding energy spent in the jump, in calories. Any other cell is unreachable from Mr. Frog&rsquo;s current position with a single jump.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/5743.%E2%80%85Lazy%E2%80%85Jumping%E2%80%85Frog/7f68c97c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5743/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:112px; width:129px" /></p>

<p>Your task is to determine the minimum amount of energy that Mr. Frog needs to spend to get from his home to Ms. Toad&rsquo;s home.</p>

### 입력

<p>The input contains several test cases. The first line of a test case contains two integers, C and R, indicating respectively the number of columns and rows of the marsh (1 &le; C, R &le; 1000). The second line of a test case contains four integers Cf , Rf , Ct , and Rt , where (Cf , Rf ) specify Mr. Frog&rsquo;s home location and (Ct , Rt) specify Ms. Toad&rsquo;s home location (1 &le; Cf , Ct &le; C and 1 &le; Rf , Rt &le; R). The third line of a test case contains an integer W (0 &le; W &le; 1000) indicating the number of watery places in the marsh. Each of the next W lines contains four integers C1, R1, C2, and R2 (1 &le; C1 &le; C2 &le; C and 1 &le; R1 &le; R2 &le; R) describing a rectangular watery place comprising cells whose coordinates (x, y) are so that C1 &le; x &le; C2 and R1 &le; y &le; R2. The end of input is indicated by C = R = 0.</p>

### 출력

<p>For each test case in the input, your program must produce one line of output, containing the minimum calories consumed by Mr. Frog to go from his home location to Ms. Toad&rsquo;s home location. If there is no way Mr. Frog can get to Ms. Toad&rsquo;s home, your program should output impossible.</p>