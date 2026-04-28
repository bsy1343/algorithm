# [Platinum II] 학급비 낭비하기 - 14498

[문제 링크](https://www.acmicpc.net/problem/14498)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 421, 정답: 197, 맞힌 사람: 160, 정답 비율: 48.780%

### 분류

이분 매칭

### 문제 설명

<p>욱제에게 미션이 주어졌다! 바로 학급비(서울시민들의 세금)로 구매할 물품을 정하는 것이다. 욱제는 학급비를 낭비(?)할 생각에 신이 났다. 본인(경기도민)이 낸 세금이 아니기 때문이다. 욱제는 낭비(?)에 적합한 두 개의 물품을 정해서 친구들의 의견을 수렴하기로 했다. 그 두 개의 물품은 바로 뽁뽁이와 꼭꼭이이다.</p>

<p style="text-align: center;"><br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14498.%E2%80%85%ED%95%99%EA%B8%89%EB%B9%84%E2%80%85%EB%82%AD%EB%B9%84%ED%95%98%EA%B8%B0/4f3e1240.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14498/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:243px; width:137px" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/14498.%E2%80%85%ED%95%99%EA%B8%89%EB%B9%84%E2%80%85%EB%82%AD%EB%B9%84%ED%95%98%EA%B8%B0/4424d676.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14498/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:248px; width:95px" /></p>

<p style="text-align: center;">(뽁뽁이와 꼭꼭이)</p>

<p>욱제의 시장조사 결과, 뽁뽁이는 n개의 색상이 있고 꼭꼭이는 m개의 모델이 있다. 욱제는 k명의 친구들에게 다음과 같은 질문을 던졌다: &quot;사고 싶은 뽁뽁이 색상과 사고 싶지 않은 꼭꼭이 모델을 하나씩 고르거나, 사고 싶지 않은 뽁뽁이 색상과 사고 싶은 꼭꼭이 모델을 하나씩 골라라&quot;&nbsp;</p>

<p>욱제는 최대한 많은 친구들을 만족시키고 싶어 한다. 친구들은 자신의 두 요구사항이 모두 반영되어야 만족한다고 한다. 하지만 모두를 만족시키긴 힘들기 때문에 욱제는 만족하지 못하게 되는 친구들에게 미안함의 표시로 사탕을 하나씩 사주려고 한다. (사실 사탕도 학급비이다)</p>

<p>욱제는 최소&nbsp;몇 개의 사탕을 준비해야할까?</p>

### 입력

<p>첫째 줄에 뽁뽁이의 색상의 수 n, 꼭꼭이의 색상의 수 m, 친구들의 수 k가 주어진다. (1 &le;&nbsp;n, m &le;&nbsp;128, 1 &le; k &le; 512)</p>

<p>이후 k개의 줄에 걸쳐 n<sub>i</sub>, m<sub>i</sub>, c<sub>i</sub>가 주어진다. n<sub>i</sub>와 m<sub>i</sub>는 뽁뽁이와 꼭꼭이의 색상(모델) 번호를 의미하며 c<sub>i</sub>가 0이면 n<sub>i</sub>를, 1이면 m<sub>i</sub>를 구매하길 원한다는 뜻이다.</p>

### 출력

<p>욱제가 최소&nbsp;&nbsp;몇 개의 사탕을 준비해야하는지 출력한다.</p>