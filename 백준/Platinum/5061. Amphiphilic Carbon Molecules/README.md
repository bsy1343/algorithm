# [Platinum I] Amphiphilic Carbon Molecules - 5061

[문제 링크](https://www.acmicpc.net/problem/5061)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 15, 맞힌 사람: 8, 정답 비율: 25.000%

### 분류

정렬, 기하학, 스위핑, 슬라이딩 윈도우, 각도 정렬, 선형 계획법

### 문제 설명

<p>Shanghai Hypercomputers, the world&#39;s largest computer chip manufacturer, has invented a new class of nanoparticles called Amphiphilic Carbon Molecules (ACMs). ACMs are semiconductors. It means that they can be either conductors or insulators of electrons, and thus possess a property that is very important for the computer chip industry. They are also amphiphilic molecules, which means parts of them are hydrophilic while other parts of them are hydrophobic. Hydrophilic ACMs are soluble in polar solvents (for example, water) but are insoluble in nonpolar solvents (for example, acetone). Hydrophobic ACMs, on the contrary, are soluble in acetone but insoluble in water. Semiconductor ACMs dissolved in either water or acetone can be used in the computer chip manufacturing process.&nbsp;</p>

<p>As a materials engineer at Shanghai Hypercomputers, your job is to prepare ACM solutions from ACM particles. You go to your factory everyday at 8 am and find a batch of ACM particles on your workbench. You prepare the ACM solutions by dripping some water, as well as some acetone, into those particles and watch the ACMs dissolve in the solvents. You always want to prepare unmixed solutions, so you first separate the ACM particles by placing an Insulating Carbon Partition Card (ICPC) perpendicular to your workbench. The ICPC is long enough to completely separate the particles. You then drip water on one side of the ICPC and acetone on the other side. The ICPC helps you obtain hydrophilic ACMs dissolved in water on one side and hydrophobic ACMs dissolved in acetone on the other side. If you happen to put the ICPC on top of some ACM particles, those ACMs will be right at the border between the water solution and the acetone solution, and they will be dissolved. Fig.1 shows your working situation.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5061.%E2%80%85Amphiphilic%E2%80%85Carbon%E2%80%85Molecules/9321af16.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5061.%E2%80%85Amphiphilic%E2%80%85Carbon%E2%80%85Molecules/9321af16.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5061/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:198px; width:364px" /></p>

<p style="text-align: center;">Fig. 1</p>

<p>Your daily job is very easy and boring, so your supervisor makes it a little bit more challenging by asking you to dissolve as much ACMs into solution as possible. You know you have to be very careful about where to put the ICPC since hydrophilic ACMs on the acetone side, or hydrophobic ACMs on the water side, will not dissolve. As an experienced engineer, you also know that sometimes it can be very difficult to find the best position for the ICPC, so you decide to write a program to help you. You have asked your supervisor to buy a special digital camera and have it installed above your workbench, so that your program can obtain the exact positions and species (hydrophilic or hydrophobic) of each ACM particle in a 2D pictures taken by the camera. The ICPC you put on your workbench will appear as a line in the 2D pictures.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5061.%E2%80%85Amphiphilic%E2%80%85Carbon%E2%80%85Molecules/1beb018c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5061.%E2%80%85Amphiphilic%E2%80%85Carbon%E2%80%85Molecules/1beb018c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5061/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:136px; width:214px" /></p>

<p style="text-align: center;">Fig. 2</p>

### 입력

<p>There will be no more than 10 test cases. Each case starts with a line containing an integer N, which is the number of ACM particles in the test case. N lines then follow. Each line contains three integers x, y, r, where (x, y) is the position of the ACM particle in the 2D picture and r can be 0 or 1, standing for the hydrophilic or hydrophobic type ACM respectively. The absolute value of x, y will be no larger than 10000. You may assume that N is no more than 1000. N = 0 signifies the end of the input and need not be processed. Fig.2 shows the positions of ACM particles and the best ICPC position for the last test case in the sample input.</p>

### 출력

<p>For each test case, output a line containing a single integer, which is the maximum number of dissolved ACM particles.</p>