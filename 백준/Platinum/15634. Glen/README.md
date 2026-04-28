# [Platinum V] Glen - 15634

[문제 링크](https://www.acmicpc.net/problem/15634)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 225, 정답: 64, 맞힌 사람: 52, 정답 비율: 30.769%

### 분류

구현, 해 구성하기

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f975ae3b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f975ae3b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/0.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3490e4e4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3490e4e4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/46043dce.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/46043dce.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/b7b97012.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/b7b97012.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2a4985b4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2a4985b4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/e5c83e82.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/e5c83e82.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/5.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7049d768.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7049d768.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/afew.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:162px; width:292px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/75f1130f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/75f1130f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/6.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3d70d288.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3d70d288.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/7.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/44889e4a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/44889e4a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/8.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c6953f81.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c6953f81.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/9.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/07b7c515.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/07b7c515.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/10.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2773e10e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2773e10e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/11.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/47a20e9c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/47a20e9c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/96d535df.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/96d535df.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/13.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/54b5e9bf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/54b5e9bf.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/14.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/80be7813.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/80be7813.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/15.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/fe7c2c4f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/fe7c2c4f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/16.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/fc37a0a4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/fc37a0a4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f1ee4eb4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f1ee4eb4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/18.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f47600a7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f47600a7.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/19.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7cbbc69d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7cbbc69d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/20.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/ddf63396.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/ddf63396.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/21.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c826c6ac.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c826c6ac.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/22.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/d52075f1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/d52075f1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/23.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/78cabcd8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/78cabcd8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/24.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/83cde5fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/83cde5fb.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/25.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/9ca02a2d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/9ca02a2d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/2627.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c77c007f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c77c007f.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/28.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8e0d385d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8e0d385d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/29.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/0cff2087.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/0cff2087.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/30.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c3be1ad1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/c3be1ad1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/31.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/b7c842db.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/b7c842db.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/31-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/52b7cb23.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/52b7cb23.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/33.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/54745e65.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/54745e65.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/34.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f2da55f7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/f2da55f7.png" data-original-src="https://upload.acmicpc.net/7a0ee066-045b-4953-ac0e-1be2be4352b5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2f0899ec.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/2f0899ec.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/36.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6ec2db68.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6ec2db68.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/37.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/1f31213a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/1f31213a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/38.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/59f20461.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/59f20461.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/39.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/15062d56.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/15062d56.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/40.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8c1e260d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8c1e260d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/41.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/d9cda402.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/d9cda402.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/42.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/0483ef02.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/0483ef02.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/43.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/24cba3f4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/24cba3f4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/44.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/01106d96.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/01106d96.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/44-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/61950930.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/61950930.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/46.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/81b94345.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/81b94345.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/47.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/109daebd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/109daebd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/02611980.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/02611980.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3d6b185e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/3d6b185e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/50.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/765c8511.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/765c8511.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/51.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/5462931b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/5462931b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/52.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/dc2a5905.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/dc2a5905.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/53.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7ec35d5b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/7ec35d5b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/54.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/02bf2a47.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/02bf2a47.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/55.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/a6e1cfbf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/a6e1cfbf.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8dc0ea70.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/8dc0ea70.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/57.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/09a48b85.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/09a48b85.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/58.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/ec580372.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/ec580372.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/59.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6ff80b35.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6ff80b35.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/60.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6f2e9bef.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/6f2e9bef.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/60-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/4b7c375e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15634.%E2%80%85Glen/4b7c375e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15634/62.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:132px; width:612px" /></p>

### 입력

<p>On the first line, I will give two positive integers N and M.</p>

<p>N is the number of rows, and M is the number of columns.</p>

<p>Both integers are at most 100.</p>

<p>Each of the next N lines will describe each row of the tiles.</p>

<p>The tiles form a rectangle, remember?</p>

<p>Also, note that I will remove all marks on the tiles before Niko starts moving.</p>

<p>&quot;#&quot; means the mark is on that tile, and &quot;.&quot; means the mark is not on that tile.</p>

<p>I guarantee that at least one tile has a mark.</p>

### 출력

<p>Tell Niko exactly how they should move.</p>

<p>&quot;U&quot; for up, &quot;D&quot; for down, &quot;L&quot; for left, and &quot;R&quot; for right.</p>

<p>Niko is allowed to go out of the rectangle.</p>