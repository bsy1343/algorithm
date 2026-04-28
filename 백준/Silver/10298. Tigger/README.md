# [Silver I] Tigger - 10298

[문제 링크](https://www.acmicpc.net/problem/10298)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 27, 맞힌 사람: 17, 정답 비율: 44.737%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>ิกเกอร์ (Tigger)เป็นสิ่งมีชีวิตที่รักการกระโดดเด้งดึ๋งมากๆ ในวันนี้ทิกเกอร์จะมากระโดดเด้งดึ๋งในทุ่งหญ้ารูปสี่เหลี่ยมมุมฉากขนาดกว้าง R หน่วย ยาว C หน่วย&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10298.%E2%80%85Tigger/d3311a62.png" data-original-src="https://www.acmicpc.net/upload/images2/tigger.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:145px; width:128px" /></p>

<p>การกระโดดของทิกเกอร์นั้นจะสามารถกระโดดไปยังช่องที่อยู่ติดกันในสี่ทิศทาง ได้แก่ ช่องด้านบน, ช่องด้านล่าง, ช่องด้านซ้าย และ ช่องด้านขวา หรือ ทิกเกอร์จะกระโดดซ้ําอยู่ช่องเดิมก็ได้ แต่ทิกเกอร์จะไม่สามารถกระโดดออกจากทุ่งหญ้าได้ เมื่อทิกเกอร์กระโดดจนครบ K ก้าวก็จะถือว่าเสร็จสิ้นภารกิจการกระโดดเด้งดึ๋งในวันนี้&nbsp;</p>

<p>จงเขียนโปรแกรมเพื่อหาจํานวนวิธีในการกระโดดเด้งดึ๋งของทิกเกอร์ โดยตอบเป็นเศษจากการหารด้วย P</p>

### 입력

<p>บรรทัดแรก รับจํานวนเต็มบวก Q แทนจํานวนคําถาม โดยที่ Q มีค่าไม่เกิน 10 อีก Q บรรทัดต่อมา แต่ละบรรทัดรับจํานวนเต็มบวก R C K P ตามลําดับห่างกันด้วยหนึ่งช่องว่าง&nbsp;</p>

<p>โดยที่ 1 &lt;= R, C &lt;= 20 และ 1 &lt;= K &lt;= 1,000 และ 1 &lt;= P &lt;= 1,000,000&nbsp;</p>

### 출력

<p>มีทั้งสิ้น Q บรรทัด แต่ละบรรทัดให้แสดงจํานวนวิธีในการกระโดดเด้งดึ๋งของทิกเกอร์ โดยตอบเป็นเศษจากการหารด้วยจํานวนเต็มบวก&nbsp;</p>

### 힌트

<p>จาก R=2, C=2, K=3 จะได้ว่า ทุ่งหญ้ากว้าง 2 หน่วย ยาว 2 หน่วย และทิกเกอร์จะต้องกระโดดเด้งดึ๋งเป็นจํานวน 3 ก้าว โดยทิกเกอร์จะสามารถกระโดดเด้งดึ๋งได้ทั้งสิ้น 36 วิธี ดังนี้&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10298.%E2%80%85Tigger/54b45549.png" data-original-src="https://www.acmicpc.net/upload/images2/tiggerhint.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:343px; width:643px" /></p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10298.%E2%80%85Tigger/0e0a8e7b.png" data-original-src="https://www.acmicpc.net/upload/images2/tiggerhint2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:180px; width:640px" /></p>