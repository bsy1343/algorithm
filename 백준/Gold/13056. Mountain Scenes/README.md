# [Gold IV] Mountain Scenes - 13056

[문제 링크](https://www.acmicpc.net/problem/13056)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 153, 정답: 65, 맞힌 사람: 54, 정답 비율: 42.520%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>An artist begins with a roll of ribbon, one inch wide. She clips it into pieces of various integral lengths, then aligns them with the bottom of a frame, rising vertically in columns, to form a mountain scene. A mountain scene must be uneven; if all columns are the same height, it&rsquo;s a plain scene, not a mountain scene! It is possible that she may not use all of the ribbon.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/150b7740.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/150b7740.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13056/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:127px; width:315px" /></p>

<p>If our artist has 4 inches of ribbon and a 2 &times; 2 inch frame, she could form these scenes:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/1e405287.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/1e405287.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13056/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:88px; width:626px" /></p>

<p>She would not form these scenes, because they&rsquo;re plains, not mountains!</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/213fb4ce.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13056.%E2%80%85Mountain%E2%80%85Scenes/213fb4ce.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13056/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:91px; width:313px" /></p>

<p>Given the length of the ribbon and the width and height of the frame, all in inches, how many different mountain scenes can she create? Two scenes are different if the regions covered by ribbon are different. There&rsquo;s no point in putting more than one piece of ribbon in any column.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The input will consist of a single line with three space-separated integers n, w and h, where n (0 &le; n &le; 10,000) is the length of the ribbon in inches, w (1 &le; w &le; 100) is the width and h (1 &le; h &le; 100) is the height of the frame, both in inches.</p>

### 출력

<p>Output a single integer, indicating the total number of mountain scenes our artist could possibly make, modulo 10<sup>9</sup> + 7.</p>