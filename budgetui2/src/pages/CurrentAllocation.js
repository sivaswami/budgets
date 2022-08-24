import { DataGrid } from '@mui/x-data-grid'
const hostcolumns: GridColDef[] = [
    { field: 'col1', headerName: 'App ID', width: 150 },
    { field: 'col2', headerName: 'App Name', width: 250 },
    { field: 'col3', headerName: 'Cloud VM', width: 150 },
    { field: 'col4', headerName: 'Managed VM', width: 150 },
    { field: 'col5', headerName: 'Physical (x86)', width: 150 },
    { field: 'col6', headerName: 'OraaS', width: 150 },
    { field: 'col7', headerName: 'MaaS', width: 150 },
    { field: 'col8', headerName: 'ECS Pods', width: 150 },
    { field: 'col9', headerName: 'Edge Node', width: 150 },
    { field: 'col10', headerName: 'EAP vCore', width: 150 },
];

const storagerows: GridRowsProp = [
    { id: 1, col1: '166944', col2: 'Oversight', col3: '5', col8: '120' },
    { id: 2, col1: '164430', col2: 'CitiRisk Retail', col3: '7', col6: '8', col8: '40' }
];
const storagecolumns: GridColDef[] = [
    { field: 'col1', headerName: 'App ID', width: 150 },
    { field: 'col2', headerName: 'App Name', width: 250 },
    { field: 'col3', headerName: 'NAS', width: 150 },
    { field: 'col4', headerName: 'SAN', width: 150 },
    { field: 'col5', headerName: 'SDS', width: 150 },
    { field: 'col6', headerName: 'Distributed Tape', width: 150 },
    { field: 'col7', headerName: 'MaaS', width: 150 },
    { field: 'col8', headerName: 'ECS Pods', width: 150 },
    { field: 'col9', headerName: 'Edge Node', width: 150 },
    { field: 'col10', headerName: 'EAP vCore', width: 150 },
];

const hostrows: GridRowsProp = [
    { id: 1, col1: '166944', col2: 'Oversight', col3: '5', col8: '120' },
    { id: 2, col1: '164430', col2: 'CitiRisk Retail', col3: '7', col6: '8', col8: '40' }
];


const hrrows: GridRowsProp = [
    { id: 1, col1: '166944', col2: 'Oversight', col3: '5', col8: '120' },
    { id: 2, col1: '164430', col2: 'CitiRisk Retail', col3: '7', col6: '8', col8: '40' }
];
const hrcolumns: GridColDef[] = [
    { field: 'col1', headerName: 'App ID', width: 150 },
    { field: 'col2', headerName: 'App Name', width: 250 },
    { field: 'col3', headerName: 'Dev-Fulltime', width: 150 },
    { field: 'col4', headerName: 'Dev-Contract', width: 150 },
    { field: 'col5', headerName: 'QA-Fulltime', width: 150 },
    { field: 'col6', headerName: 'QA-Contract', width: 150 },
    { field: 'col7', headerName: 'DevOps-Fulltime', width: 150 },
    { field: 'col8', headerName: 'DevOps-Contract', width: 150 },
];
export default function CurrentAllocation() {
    return (
        <div>
            <h4>Current Host Allocation </h4>
            <div style={{ height: 300, width: '100%' }}>
                <DataGrid rows={hostrows} columns={hostcolumns} />
            </div>
            <h4>Current Storage Allocation </h4>
            <div style={{ height: 300, width: '100%' }}>
                <DataGrid rows={storagerows} columns={storagecolumns} />
            </div>
            <h4>Current Resource Allocation </h4>
            <div style={{ height: 300, width: '100%' }}>
                <DataGrid rows={hrrows} columns={hrcolumns} />
            </div>
        </div>

    )
}
