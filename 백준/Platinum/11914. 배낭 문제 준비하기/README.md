# [Platinum I] 배낭 문제 준비하기 - 11914

[문제 링크](https://www.acmicpc.net/problem/11914)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 61, 정답: 22, 맞힌 사람: 22, 정답 비율: 62.857%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>문제를 출제하는 과정 중에서 중요한 축 중 하나가 바로 데이터를 만드는 일입니다. 데이터를 만드는 일반적인 방법 같은 것은 없고, 문제에 따라 발생할 수 있는 모든 오답들을 최대한 생각해보고 이들에 대비한 데이터를 만들어야 합니다.</p>

<p>예를 들어 아래와 같은 유명한 문제를 생각해 봅시다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11914.%E2%80%85%EB%B0%B0%EB%82%AD%E2%80%85%EB%AC%B8%EC%A0%9C%E2%80%85%EC%A4%80%EB%B9%84%ED%95%98%EA%B8%B0/d4ac3971.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11914.%E2%80%85%EB%B0%B0%EB%82%AD%E2%80%85%EB%AC%B8%EC%A0%9C%E2%80%85%EC%A4%80%EB%B9%84%ED%95%98%EA%B8%B0/d4ac3971.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11914/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:282px; width:384px" /></p>

<p>저는 이 문제에서 발생할 수 있는 다양한 오답들을 떠올리다가, 답이 정확히 t인 데이터에서 t - 1을 출력하는 답안을 생각해냈습니다. 이러한 답안을 걸러주는 데이터를 마련하기 위해, 저는 어떤 자연수 t가 주어졌을 때, 위 문제의 답이 t가 되도록 하는 집합 S와 자연수 k를 구해주는 프로그램이 필요합니다.</p>

<p>하지만 저는 그 능력이 부족한 관계로, 여러분이 대신 프로그램을 작성해주셔야 합니다.</p>

### 입력

<p>첫 번째 줄에 자연수 t가 주어집니다. (1 &le; t &le; 10<sup>18</sup>)</p>

### 출력

<p>첫 번째 줄에 n과 k를 공백을 사이로 두고 출력합니다. 두 번째 줄에 a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>을 공백을 사이로 두고 출력합니다.</p>

<p>모든 변수의 이름과 제약 조건은 위 그림에 나타낸 문제와 같습니다. 출력한 데이터는 반드시 이 조건을 충족해야 합니다.</p>